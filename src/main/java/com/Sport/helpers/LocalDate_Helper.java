package com.Sport.helpers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalDate_Helper {

    public static LocalDate convertToLocalDate(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
