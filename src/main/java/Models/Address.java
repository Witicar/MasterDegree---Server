package Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "\"ADDRESSES\"")
public class Address {

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "address_patient", cascade = CascadeType.ALL)
    private List<Patient> patientAddresses = new ArrayList<Patient>();

    @Id
    @GeneratedValue
    @Column(name = "\"Address ID\"", nullable = false, unique = true)
    private long addressID;

    @Column(name = "Country")
    private String country;

    @Column(name = "Voivodeship")
    private String voivodeship;

    @Column(name = "City")
    private String city;

    @Column(name = "Postalcode")
    private String postalcode;

    @Column(name = "\"House Number\"")
    private String houseNumber;

    public Address() {
    }

    public long getAddressID() {
        return addressID;
    }

    public void setAddressID(long addressID) {
        this.addressID = addressID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getVoivodeship() {
        return voivodeship;
    }

    public void setVoivodeship(String voivodeship) {
        this.voivodeship = voivodeship;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postcode) {
        this.postalcode = postcode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /////////////////////////////////////////////////


    public List<Patient> getPatientAddresses() {
        return patientAddresses;
    }

    public void setPatientAddresses(List<Patient> patientAddresses) {
        this.patientAddresses = patientAddresses;
    }
}
