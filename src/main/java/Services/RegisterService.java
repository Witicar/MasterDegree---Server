package Services;

import Models.Patient;
import Database.Database;

import javax.persistence.NoResultException;
import javax.persistence.Query;

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
            query_login.getSingleResult().toString().equals(login);
        } catch (NoResultException e) {
            isExist=Boolean.FALSE;
        }
        finally {
            entityManager.getTransaction().commit();
            closeDatabase();
            return isExist;
        }
    }

    public Patient postRegisterData(Patient patient)
    {
        startDatabase();
        entityManager.getTransaction().begin();
        entityManager.persist(patient);
        entityManager.getTransaction().commit();
        closeDatabase();
        return patient;
    }
}
