package Models;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "\"MEDICAL HISTORY\"")
public class MedicalHistory {

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "\"FK MedicalHistory PatientVisit\"")
    private Visit medicalHistory_visit;

    @Id
    @GeneratedValue
    @Column(name = "\"Medical History ID\"", nullable = false, unique = true)
    private long medicalHisotryID;

    @Column(name = "Illness")
    private String illness;

    @Temporal(TemporalType.DATE)
    @Column(name = "\"Date of Medical History\"")
    private Date dateOfMedicalHistory;

    @Column(name = "Symptoms")
    private String symptoms;

    public MedicalHistory() {
    }

    public long getMedicalHisotryID() {
        return medicalHisotryID;
    }

    public void setMedicalHisotryID(long medicalHisotryID) {
        this.medicalHisotryID = medicalHisotryID;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Date getDateOfMedicalHistory() {
        return dateOfMedicalHistory;
    }

    public void setDateOfMedicalHistory(Date date) {
        this.dateOfMedicalHistory = date;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    /////////////////////////////////////////////////////////////////////


    public Visit getMedicalHistory_visit() {
        return medicalHistory_visit;
    }

    public void setMedicalHistory_visit(Visit medicalHistory_visit) {
        this.medicalHistory_visit = medicalHistory_visit;
    }
}
