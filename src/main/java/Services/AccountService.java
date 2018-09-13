package Services;

import Models.Address;
import Models.Patient;
import Database.Database;

import javax.persistence.Query;

public class AccountService extends Database{

    public Patient putPatientData(String login, Patient patient)
    {
        startDatabase();
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("from Patient p where p.login =: login");
        query.setParameter("login", login);

        Patient p = (Patient) query.getSingleResult();

        p.setPhoneNumber(patient.getPhoneNumber());
        p.setPriority(patient.getPriority());
        p.setAddress_patient(patient.getAddress_patient());

        entityManager.getTransaction().commit();
        closeDatabase();
        return p;
    }

    public Address getAddressData(String login)
    {
        startDatabase();
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select p.address_patient from Patient p where login =: login");
        query.setParameter("login", login);

        Address a = (Address) query.getSingleResult();

        entityManager.getTransaction().commit();
        closeDatabase();
        return a;
    }

}
