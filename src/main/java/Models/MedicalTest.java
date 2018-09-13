package Models;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "\"MEDICAL TESTS\"")
public class MedicalTest {

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "\"FK MedicalTest PatientVisit\"")
    private Visit medicalTest_visit;

    @Id
    @GeneratedValue
    @Column(name = "\"Medical Test ID\"", nullable = false, unique = true)
    private long medicalTestID;

    @Column(name = "Name")
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "\"Date of Medical Test\"")
    private Date dateOfMedicalTest;

    @Column(name = "Results")
    private String results;

    public MedicalTest() {
    }

    public long getMedicalTestID() {
        return medicalTestID;
    }

    public void setMedicalTestID(long medicalTestID) {
        this.medicalTestID = medicalTestID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfMedicalTest() {
        return dateOfMedicalTest;
    }

    public void setDateOfMedicalTest(Date date) {
        this.dateOfMedicalTest = date;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    ////////////////////////////////////////////////////////////////////////////


    public Visit getMedicalTest_visit() {
        return medicalTest_visit;
    }

    public void setMedicalTest_visit(Visit medicalTest_visit) {
        this.medicalTest_visit = medicalTest_visit;
    }
}
