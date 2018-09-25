package Services;

import Models.MedicalTestRegistration;
import Database.Database;
import Models.Patient;

import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class MedicalTestService extends Database{

    public List<MedicalTestRegistration> getMedicalTestRegistration() {

        List<MedicalTestRegistration> medicalTestRegistrationList;

        startDatabase();
        entityManager.getTransaction().begin();
        medicalTestRegistrationList = entityManager.createQuery("from MedicalTestRegistration").getResultList();
        entityManager.getTransaction().commit();
        closeDatabase();

        return medicalTestRegistrationList;
    }

    public Patient putMedicalTestRegistration(Patient patient) {

        startDatabase();
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("from Patient p where p.login =: login");
        query.setParameter("login", patient.getLogin());

        Patient p = (Patient) query.getSingleResult();
        p.setMedicalTestRegistration_patient(patient.getMedicalTestRegistration_patient());

        entityManager.getTransaction().commit();
        closeDatabase();
        return p;
    }

    public List<Patient> moveMedicalTestRegistration(Integer position) {

        startDatabase();
        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("from Patient p where p.medicalTestRegistration_patient.position >: position");
        query.setParameter("position", position);

        List<Patient> patientList = query.getResultList();

        Collections.sort(patientList, (o1, o2) -> new Integer(o2.getMedicalTestRegistration_patient().getPosition()).compareTo(o1.getMedicalTestRegistration_patient().getPosition()));

        for(Patient p : patientList)
        p.getMedicalTestRegistration_patient().setPosition(p.getMedicalTestRegistration_patient().getPosition()+1);

        entityManager.getTransaction().commit();
        closeDatabase();
        return patientList;
    }

    public void deleteMedicalTestRegistration() {
        List<MedicalTestRegistration> medicalTestRegistrationList;

        startDatabase();
        entityManager.getTransaction().begin();
        medicalTestRegistrationList = entityManager.createQuery("from MedicalTestRegistration").getResultList();

        Query query = entityManager.createQuery("from Patient p where p.medicalTestRegistration_patient.position =: par");
        query.setParameter("par", 1);
        Patient patient = (Patient) query.getSingleResult();
        entityManager.remove(patient.getMedicalTestRegistration_patient());
        patient.setMedicalTestRegistration_patient(null);
        entityManager.flush();
        entityManager.clear();

        for(MedicalTestRegistration m : medicalTestRegistrationList)
            m.setPosition(m.getPosition() - 1);

        entityManager.getTransaction().commit();
        closeDatabase();
    }
}
