package Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "\"HOURS OF ADMISSION\"")
public class HoursOfAdmission {

    @Id
    @GeneratedValue
    @Column(name = "\"Hours of Admission ID\"", nullable = false, unique = true)
    private long hoursOfAdmissionID;

    @Column(name = "Monday_start")
    private int monday_start;

    @Column(name = "Thuesday_start")
    private int thuesday_start;

    @Column(name = "Wednesday_start")
    private int wednesday_start;

    @Column(name = "Thursday_start")
    private int thursday_start;

    @Column(name = "Friday_start")
    private int friday_start;

    @Column(name = "Monday_end")
    private int monday_end;

    @Column(name = "Thuesday_end")
    private int thuesday_end;

    @Column(name = "Wednesday_end")
    private int wednesday_end;

    @Column(name = "Thursday_end")
    private int thursday_end;

    @Column(name = "Friday_end")
    private int friday_end;

    public HoursOfAdmission() {
    }

    public long getHoursOfAdmissionID() {
        return hoursOfAdmissionID;
    }

    public void setHoursOfAdmissionID(long hoursOfAdmissionID) {
        this.hoursOfAdmissionID = hoursOfAdmissionID;
    }

    public int getMonday_start() {
        return monday_start;
    }

    public void setMonday_start(int monday_start) {
        this.monday_start = monday_start;
    }

    public int getThuesday_start() {
        return thuesday_start;
    }

    public void setThuesday_start(int thuesday_start) {
        this.thuesday_start = thuesday_start;
    }

    public int getWednesday_start() {
        return wednesday_start;
    }

    public void setWednesday_start(int wednesday_start) {
        this.wednesday_start = wednesday_start;
    }

    public int getThursday_start() {
        return thursday_start;
    }

    public void setThursday_start(int thursday_start) {
        this.thursday_start = thursday_start;
    }

    public int getFriday_start() {
        return friday_start;
    }

    public void setFriday_start(int friday_start) {
        this.friday_start = friday_start;
    }

    public int getMonday_end() {
        return monday_end;
    }

    public void setMonday_end(int monday_end) {
        this.monday_end = monday_end;
    }

    public int getThuesday_end() {
        return thuesday_end;
    }

    public void setThuesday_end(int thuesday_end) {
        this.thuesday_end = thuesday_end;
    }

    public int getWednesday_end() {
        return wednesday_end;
    }

    public void setWednesday_end(int wednesday_end) {
        this.wednesday_end = wednesday_end;
    }

    public int getThursday_end() {
        return thursday_end;
    }

    public void setThursday_end(int thursday_end) {
        this.thursday_end = thursday_end;
    }

    public int getFriday_end() {
        return friday_end;
    }

    public void setFriday_end(int friday_end) {
        this.friday_end = friday_end;
    }
}
