package Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "\"LIST OF DOCTORS\"")
public class Doctor {

    @OneToMany(mappedBy = "visit_doctor")
    private List<Visit> doctorVisits = new ArrayList<Visit>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"FK Doctor HoursOfAdmission\"")
    private HoursOfAdmission doctor_hoursOfAdmission;

    @Id
    @GeneratedValue
    @Column(name = "\"Doctor ID\"")
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
    private int phoneNumber;

    @Column(name = "Login")
    private String login;

    @Column(name = "Password")
    private String password;

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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
