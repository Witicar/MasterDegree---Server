package Models;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "\"MEDICAL TEST REGISTRATION\"")
public class MedicalTestRegistration {

    @Id
    @GeneratedValue
    @Column(name = "\"Medical Test Registration ID\"", nullable = false, unique = true)
    private long medicalTestID;

    @Column(name = "Position", unique = true)
    private int position;

    @Column(name = "Priority", nullable = false)
    private String priority;

    public MedicalTestRegistration() {
    }

    public long getMedicalTestID() {
        return medicalTestID;
    }

    public void setMedicalTestID(long medicalTestID) {
        this.medicalTestID = medicalTestID;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getPriority() {return priority;}

    public void setPriority(String priority) {this.priority = priority;}
}
