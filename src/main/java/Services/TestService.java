package Services;

import Models.Doctor;
import Models.HoursOfAdmission;
import Database.Database;
import Models.Visit;

import javax.management.Query;
import javax.print.Doc;

public class TestService extends Database{

    public Doctor postDoctor(Doctor doctor)
    {
        startDatabase();
        entityManager.getTransaction().begin();
        entityManager.persist(doctor);
        entityManager.getTransaction().commit();
        closeDatabase();
        return doctor;
    }

    public HoursOfAdmission postHoursOfAdmission(HoursOfAdmission hoursOfAdmission)
    {
        startDatabase();
        entityManager.getTransaction().begin();
        entityManager.persist(hoursOfAdmission);
        entityManager.getTransaction().commit();
        closeDatabase();
        return hoursOfAdmission;
    }

    public Visit postVisit(Visit visit) {
        startDatabase();
        entityManager.getTransaction().begin();
        entityManager.persist(visit);
        entityManager.getTransaction().commit();
        closeDatabase();
        return visit;
    }
}
