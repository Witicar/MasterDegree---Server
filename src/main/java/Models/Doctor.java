package Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "\"LIST OF DOCTORS\"")
public class Doctor {

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "visit_doctor", cascade = CascadeType.ALL)
    private List<Visit> doctorVisits = new ArrayList<Visit>();

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "\"FK Doctor HoursOfAdmission\"")
    private HoursOfAdmission doctor_hoursOfAdmission;

    @Id
    @GeneratedValue
    @Column(name = "\"Doctor ID\"", nullable = false, unique = true)
    private long doctorID;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Name")
    private String name;

    @Column(name = "Specialization")
    private String specialization;

    @Column(name = "\"Practice Number\"")
    private int practiceNumber;

    @Column(name = "\"Phone Number\"")
    private long phoneNumber;

    public Doctor() {
    }

    public long getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(long doctorID) {
        this.doctorID = doctorID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getPracticeNumber() {
        return practiceNumber;
    }

    public void setPracticeNumber(int practiceNumber) {
        this.practiceNumber = practiceNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    ////////////////////////////////////////////////////////////////////


    public List<Visit> getDoctorVisits() {
        return doctorVisits;
    }

    public void setDoctorVisits(List<Visit> doctorVisits) {
        this.doctorVisits = doctorVisits;
    }

    public HoursOfAdmission getDoctor_hoursOfAdmission() {
        return doctor_hoursOfAdmission;
    }

    public void setDoctor_hoursOfAdmission(HoursOfAdmission doctor_hoursOfAdmission) {
        this.doctor_hoursOfAdmission = doctor_hoursOfAdmission;
    }
}
