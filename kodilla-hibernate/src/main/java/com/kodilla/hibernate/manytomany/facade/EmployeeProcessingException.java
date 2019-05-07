package com.kodilla.hibernate.manytomany.facade;

public class EmployeeProcessingException extends Exception {
    public static String ERR_NOT_FOUND = "Employee not found";
    public static String ERR_NAME_NULL = "Employee name cannot be null";

    public EmployeeProcessingException(String message) {
        super(message);
    }
}
