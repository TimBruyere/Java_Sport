package com.Sport.mapper;

import com.Sport.models.Activity;
import org.bson.Document;

import java.sql.Date;

import static com.Sport.helpers.LocalDate_Helper.convertToLocalDate;

public class ActivityRepository {
    public static Document ActivityToDocument(Activity activity){
        return new Document()
                .append("Name", activity.getName())
                .append("ActivityDate", activity.getActivityDate())
                .append("RPE", activity.getRPE())
                .append("Duration", activity.getDuration())
                .append("Charge", activity.getCharge());
    }

    public static Activity DocumentToActivity(Document document){
        Activity activity = new Activity();
        activity.setName(document.getString("Name"));
        activity.setActivityDate(convertToLocalDate(document.getDate("ActivityDate")));
        activity.setRPE(document.getDouble("RPE"));
        activity.setDuration(document.getLong("Duration"));
        activity.setCharge(document.getDouble("charge"));

        return activity;
    }
}
