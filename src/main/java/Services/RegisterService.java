package Services;

import Models.Address;
import Models.Patient;
import Database.Database;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.ws.rs.QueryParam;

public class RegisterService extends Database{

    public Boolean isRegisterLoginMailExist(String login, String mail)
    {
        Query query_login, query_mail;
        Boolean isExist = Boolean.TRUE;

        startDatabase();
        entityManager.getTransaction().begin();
        query_login = entityManager.createQuery("select patient.login from Patient patient where patient.login =: login");
        query_login.setParameter("login", login);
        query_mail = entityManager.createQuery("select patient.email from Patient patient where patient.email =: mail");
        query_mail.setParameter("mail", mail);
        try {
            if(query_login.getSingleResult().toString().equals(login))
                isExist=Boolean.TRUE;
        } catch (NoResultException e) {
            try {
                if (query_mail.getSingleResult().toString().equals(mail))
                    isExist = Boolean.TRUE;
            } catch (NoResultException f) {
                isExist = Boolean.FALSE;
            }
        }
        finally {
            entityManager.getTransaction().commit();
            closeDatabase();
            return isExist;
        }
    }

    public Patient postPatientData(Patient patient)
    {
        startDatabase();
        entityManager.getTransaction().begin();
        entityManager.persist(patient);
        entityManager.getTransaction().commit();
        closeDatabase();
        return patient;
    }
}
