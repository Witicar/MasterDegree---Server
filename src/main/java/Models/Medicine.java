package Models;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "\"MEDICINES\"")
public class Medicine {

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "\"FK Medicine PatientVisit\"")
    private Visit medicine_visit;

    @Id
    @GeneratedValue
    @Column(name = "\"Medicine ID\"", nullable = false, unique = true)
    private long medicinesID;

    @Column(name = "Code", nullable = false, unique = true)
    private String code;

    @Column(name = "Name")
    private String name;

    @Column(name = "Price")
    private float price;

    @Column(name = "Quantity")
    private String quantity;

    public Medicine() {
    }

    public long getMedicinesID() {
        return medicinesID;
    }

    public void setMedicinesID(long medicinesID) {
        this.medicinesID = medicinesID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    //////////////////////////////////////////////////////////


    public Visit getMedicine_visit() {
        return medicine_visit;
    }

    public void setMedicine_visit(Visit medicine_visit) {
        this.medicine_visit = medicine_visit;
    }
}
