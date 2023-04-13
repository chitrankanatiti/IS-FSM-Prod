package com.hdsoft.fsm.utils;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static final DateTimeFormatter DD_MM_YYYY = DateTimeFormatter.ofPattern("dd - MM - yyyy");
    public static final DateTimeFormatter DD_MMM_YYYY = DateTimeFormatter.ofPattern("dd - MMM - yyyy");
    public static final DateTimeFormatter EEE_DD_MM_YYYY = DateTimeFormatter.ofPattern("EEE, dd MM yyyy");
    public static final DateTimeFormatter EEEE_DD_MMM_YYYY = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy");
    public static final DateTimeFormatter EEEE_DD_MMMM_YYYY = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
    public static final DateTimeFormatter HH_MM_A = DateTimeFormatter.ofPattern("hh : mm a");
    public static final DateTimeFormatter HH_MM_SS_A = DateTimeFormatter.ofPattern("hh : mm : ss a");

    public static String now(){
        return LocalDate.now().format(DD_MM_YYYY);
    }

    public static String nowFull(){
        return LocalDate.now().format(EEEE_DD_MMMM_YYYY);
    }

    public static String now(DateTimeFormatter formatter){
        return LocalDate.now().format(formatter);
    }

    public static String timeShort(){
        return LocalDateTime.now().format(HH_MM_A);
    }

    public static String timeLong(){
        return LocalTime.now().format(HH_MM_SS_A);
    }

    public static LocalDate parse(String date, DateTimeFormatter formatter){
        return LocalDate.parse(date, formatter);
    }

}
