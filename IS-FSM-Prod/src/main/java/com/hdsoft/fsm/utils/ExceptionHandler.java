package com.hdsoft.fsm.utils;

public class ExceptionHandler {
    public static String getException(Exception ex) {
        ex.printStackTrace();
        if (ex.getMessage().contains("ConstraintViolationException")) {
            return "Data Already Exists";
        } else if (ex.getMessage().contains("JDBCConnectionException")) {
            return "Connection Lost";
        } else if (ex.getMessage().contains("DataIntegrityViolationException")) {
            return "Data Already Exists";
        } else {
            return ex.getMessage().contains("CommunicationException") ? "Connection Lost" : ex.getMessage();
        }
    }
}
