package Services;

import Database.Database;
import Models.Doctor;
import Models.HoursOfAdmission;
import Models.Patient;
import Models.Visit;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

public class RegistrationService extends Database {

    public List<Doctor> getDoctors()
    {
        List doctorList;

        startDatabase();
        entityManager.getTransaction().begin();
        doctorList = entityManager.createQuery("from Doctor").getResultList();
        entityManager.getTransaction().commit();
        closeDatabase();

        return doctorList;
    }


    public List<Visit> getVisites(String login) {
        List visitList;

        startDatabase();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("from Visit v where v.visit_patient.login =: login");
        query.setParameter("login", login);
        visitList = query.getResultList();
        entityManager.getTransaction().commit();
        closeDatabase();

        return visitList;
    }

    public Visit putVisit(Visit visit, String login, long doctor_id) {

        startDatabase();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("from Patient p where p.login =: login");
        query.setParameter("login", login);
        Patient patient =(Patient) query.getSingleResult();
        Doctor doctor = entityManager.find(Doctor.class, doctor_id);
        visit.setVisit_patient(patient);
        visit.setVisit_doctor(doctor);
        entityManager.persist(visit);
        entityManager.getTransaction().commit();
        closeDatabase();
        return visit;

    }

    public Patient getPatient(String login) {

        startDatabase();
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("from Patient p where p.login =: login");
        query.setParameter("login", login);

        Patient patient = (Patient) query.getSingleResult();

        entityManager.getTransaction().commit();
        closeDatabase();

        return patient;
    }

    public List<Visit> putVisites(int hour) {

        startDatabase();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("from Visit");
        List<Visit> visitList = query.getResultList();

        Collections.sort(visitList, (o1, o2) -> new Integer(o1.getVisitTime()).compareTo(o2.getVisitTime()));

        for(Visit v : visitList)
        {
            if(v.getVisitTime()>=hour) {
                if(containsInteger(visitList, v.getVisitTime()+15))
                    v.setVisitTime(v.getVisitTime() + 15);
                else {
                    v.setVisitTime(v.getVisitTime() + 15);
                    break;
                }
            }
        }

        entityManager.getTransaction().commit();
        closeDatabase();
        return visitList;
    }

    public boolean containsInteger(final List<Visit> list, final Integer number){
        return list.stream().map(Visit::getVisitTime).filter(number::equals).findFirst().isPresent();
    }

}
