package com.stsi.cbus.bdd.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {


    public static String getCurrentDateinMMDDYYFormat(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String getYesterdayDateMMDDYYFormat() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now.minusDays(1));
    }


    public static String getFromDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now.minusDays(1));
    }


    public static String getrandomNumberOnDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mmddyyhhmmss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now.minusDays(1));
    }
}
