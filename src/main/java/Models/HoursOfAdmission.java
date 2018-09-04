package Models;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "\"HOURS OF ADMISSION\"")
public class HoursOfAdmission {

    @OneToMany(mappedBy = "doctor_hoursOfAdmission")
    List<Doctor> hourOfAdmissionDoctors = new ArrayList<Doctor>();

    @Id
    @GeneratedValue
    @Column(name = "\"Hours of Admission ID\"")
    private long hoursOfAdmissionID;

    @Column(name = "Day")
    private String day;

    @Column(name = "\"Start Time\"")
    private Time startTime;

    @Column(name = "\"End Time\"")
    private Time endTime;

    public HoursOfAdmission() {
    }

    public long getHoursOfAdmissionID() {
        return hoursOfAdmissionID;
    }

    public void setHoursOfAdmissionID(long hoursOfAdmissionID) {
        this.hoursOfAdmissionID = hoursOfAdmissionID;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
