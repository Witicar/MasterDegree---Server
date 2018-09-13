package Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "\"ADRESSES\"")
public class Adress {

    @OneToMany(mappedBy = "adress_patient")
    private List<Patient> patiensAdress = new ArrayList<Patient>();

    @Id
    @GeneratedValue
    @Column(name = "\"Adress ID\"")
    private long adressID;

    @Column(name = "Country")
    private String country;

    @Column(name = "Voivodeship")
    private String voivodeship;

    @Column(name = "City")
    private String city;

    @Column(name = "Postcode")
    private String postcode;

    @Column(name = "\"House Number\"")
    private String houseNumber;

    public Adress() {
    }

    public long getAdressID() {
        return adressID;
    }

    public void setAdressID(long adressID) {
        this.adressID = adressID;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
