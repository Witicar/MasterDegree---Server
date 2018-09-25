package Models;

import org.codehaus.jackson.annotate.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "\"LIST OF PATIENTS\"")
public class Patient {


    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinColumn(name = "\"FK Patient Address\"")
    private Address address_patient;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "\"FK Medical Test Registration\"")
    private MedicalTestRegistration medicalTestRegistration_patient;

    @OneToMany (fetch = FetchType.EAGER, mappedBy = "visit_patient", cascade = CascadeType.ALL)
    private List<Visit> patientVisites = new ArrayList<Visit>();

    @Id
    @GeneratedValue
    @Column(name = "\"Patient ID\"", nullable = false, unique = true)
    private long patientID;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Name")
    private String name;

    @Column(name = "Sex")
    private String sex;

    @Column(name = "Pesel")
    private long pesel;

    @Temporal(TemporalType.DATE)
    @Column(name = "\"Birth Date\"")
    private Date birthDate;

    @Column(name = "\"Place of Birth\"")
    private String placeOfBirth;

    @Column(name = "\"Phone Number\"")
    private long phoneNumber;

    @Column(name = "Login", nullable = false, unique = true)
    private String login;

    @Column(name = "Password", nullable = false, unique = true)
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

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
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

    ///////////////////////////////////////////////////////////////////

    public MedicalTestRegistration getMedicalTestRegistration_patient() {
        return medicalTestRegistration_patient;
    }

    public void setMedicalTestRegistration_patient(MedicalTestRegistration medicalTestRegistration_patient) {
        this.medicalTestRegistration_patient = medicalTestRegistration_patient;
    }

    public Address getAddress_patient() {
        return address_patient;
    }

    public void setAddress_patient(Address address_patient) {
        this.address_patient = address_patient;
    }

    public List<Visit> getPatientVisites() {
        return patientVisites;
    }

    public void setPatientVisites(List<Visit> patientVisites) {
        this.patientVisites = patientVisites;
    }
}
