package com.Sport.models;

import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.util.Date;

public class Activity {
    private ObjectId ActivityId;
    private String Name;
    private LocalDate ActivityDate;
    private Double RPE;
    private Long Duration;
    private Double Charge;

    public Activity(){}

    public Activity(String name, LocalDate activityDate, Double RPE, Long duration, Double charge) {
        Name = name;
        ActivityDate = activityDate;
        this.RPE = RPE;
        Duration = duration;
        Charge = charge;
    }

    public Activity(ObjectId activityId, String name, LocalDate activityDate, Double RPE, Long duration, Double charge) {
        ActivityId = activityId;
        Name = name;
        ActivityDate = activityDate;
        this.RPE = RPE;
        Duration = duration;
        Charge = charge;
    }

    public ObjectId getActivityId() {
        return ActivityId;
    }

    public void setActivityId(ObjectId activityId) {
        ActivityId = activityId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getActivityDate() {
        return ActivityDate;
    }

    public void setActivityDate(LocalDate activityDate) {
        ActivityDate = activityDate;
    }

    public Double getRPE() {
        return RPE;
    }

    public void setRPE(Double RPE) {
        this.RPE = RPE;
    }

    public Long getDuration() {
        return Duration;
    }

    public void setDuration(Long duration) {
        Duration = duration;
    }

    public Double getCharge() {
        return Charge;
    }

    public void setCharge(Double charge) {
        Charge = charge;
    }

}
