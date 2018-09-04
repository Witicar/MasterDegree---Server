package Models;

import javax.persistence.*;
import javax.ws.rs.Consumes;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "\"LIST OF PATIENTS\"")
public class Patient {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"FK Patient Adress\"")
    private Adress adress_patient;

    @OneToMany (mappedBy = "visit_patient")
    private List<Visit> patientVisites = new ArrayList<Visit>();

    @Id
    @GeneratedValue
    @Column(name = "\"Patient ID\"")
    private long patientID;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Name")
    private String name;

    @Column(name = "Sex")
    private String sex;

    @Column(name = "Pesel")
    private int pesel;

    @Temporal(TemporalType.DATE)
    @Column(name = "\"Birth Date\"")
    private Date birthDate;

    @Column(name = "\"Place of Birth\"")
    private String placeOfBirth;

    @Column(name = "\"Phone Number\"")
    private int phoneNumber;

    @Column(name = "Login")
    private String login;

    @Column(name = "Password")
    private String password;

    @Column(name = "Email")
    private String email;

    @Column(name = "Priority")
    private String priority;

    public Patient() {

    }

    public Patient(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public long getPatientID() {
        return patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date date) {
        this.birthDate = date;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
