package com.rebecka.doubledrops.week;

import javax.persistence.*;

@Entity
@Table(name = "weeks")

public class Week {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "monday")
    private Boolean monday;

    @Column(nullable = false, name = "tuesday")
    private Boolean tuesday;

    @Column(nullable = false, name = "wednesday")
    private Boolean wednesday;

    @Column(nullable = false, name = "thursday")
    private Boolean thursday;

    @Column(nullable = false, name = "friday")
    private Boolean friday;

    @Column(nullable = false, name = "saturday")
    private Boolean saturday;

    @Column(nullable = false, name = "sunday")
    private Boolean sunday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getMonday() {
        return monday;
    }

    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    public Boolean getTuesday() {
        return tuesday;
    }

    public void setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
    }

    public Boolean getWednesday() {
        return wednesday;
    }

    public void setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
    }

    public Boolean getThursday() {
        return thursday;
    }

    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    public Boolean getFriday() {
        return friday;
    }

    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

    public Boolean getSaturday() {
        return saturday;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }

    public Boolean getSunday() {
        return sunday;
    }

    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }
}
