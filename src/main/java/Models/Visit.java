package Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "\"PATIENT VISITES\"")
public class Visit {

    @OneToMany(mappedBy = "medicalHistory_visit")
    private List<MedicalHistory> visitMedicialHistories = new ArrayList<MedicalHistory>();

    @OneToMany(mappedBy = "medicine_visit")
    private List<Medicine> visitMedicines = new ArrayList<Medicine>();

    @OneToMany(mappedBy = "medicalTest_visit")
    private List<MedicalTest> visitMedicalTests = new ArrayList<MedicalTest>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"FK PatientVisit Patient\"")
    private Patient visit_patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"FK PatienVisit Doctor\"")
    private Doctor visit_doctor;

    @Id
    @GeneratedValue
    @Column(name = "\"Patient Visit ID\"")
    private long patientVisitID;

    @Column(name = "\"Health Facility\"")
    private String healthFacility;

    @Temporal(TemporalType.DATE)
    @Column(name = "\"Visit Day\"")
    private Date visitDay;

    public Visit() {
    }

    public long getPatientVisitID() {
        return patientVisitID;
    }

    public void setPatientVisitID(long patientVisitID) {
        this.patientVisitID = patientVisitID;
    }

    public String getHealthFacility() {
        return healthFacility;
    }

    public void setHealthFacility(String healthFacility) {
        this.healthFacility = healthFacility;
    }

    public Date getVisitDay() {
        return visitDay;
    }

    public void setVisitDay(Date visitDay) {
        this.visitDay = visitDay;
    }
}
