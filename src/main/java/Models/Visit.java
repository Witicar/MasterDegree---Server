package Models;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "\"PATIENT VISITES\"")
public class Visit {

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "medicalHistory_visit", cascade = CascadeType.ALL)
    private List<MedicalHistory> visitMedicialHistories = new ArrayList<MedicalHistory>();

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "medicine_visit", cascade = CascadeType.ALL)
    private List<Medicine> visitMedicines = new ArrayList<Medicine>();

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "medicalTest_visit", cascade = CascadeType.ALL)
    private List<MedicalTest> visitMedicalTests = new ArrayList<MedicalTest>();

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "\"FK PatientVisit Patient\"")
    private Patient visit_patient;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "\"FK PatienVisit Doctor\"")
    private Doctor visit_doctor;

    @Id
    @GeneratedValue
    @Column(name = "\"Patient Visit ID\"", nullable = false, unique = true)
    private long patientVisitID;

    @Column(name = "\"Visit Time\"", nullable = false)
    private int visitTime;

    public Visit() {
    }

    public long getPatientVisitID() {
        return patientVisitID;
    }

    public void setPatientVisitID(long patientVisitID) {
        this.patientVisitID = patientVisitID;
    }

    public int getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(int visitDay) {
        this.visitTime = visitDay;
    }

    /////////////////////////////////////////////////////////////////


    public List<MedicalHistory> getVisitMedicialHistories() {
        return visitMedicialHistories;
    }

    public void setVisitMedicialHistories(List<MedicalHistory> visitMedicialHistories) {
        this.visitMedicialHistories = visitMedicialHistories;
    }

    public List<Medicine> getVisitMedicines() {
        return visitMedicines;
    }

    public void setVisitMedicines(List<Medicine> visitMedicines) {
        this.visitMedicines = visitMedicines;
    }

    public List<MedicalTest> getVisitMedicalTests() {
        return visitMedicalTests;
    }

    public void setVisitMedicalTests(List<MedicalTest> visitMedicalTests) {
        this.visitMedicalTests = visitMedicalTests;
    }

    public Patient getVisit_patient() {
        return visit_patient;
    }

    public void setVisit_patient(Patient visit_patient) {
        this.visit_patient = visit_patient;
    }

    public Doctor getVisit_doctor() {
        return visit_doctor;
    }

    public void setVisit_doctor(Doctor visit_doctor) {
        this.visit_doctor = visit_doctor;
    }
}
