package com.kodilla.hibernate.manytomany.facade;

public class CompanyProcessingException extends Exception {
    public static String ERR_NOT_FOUND = "Company not found";
    public static String ERR_NAME_NULL = "Company name cannot be null";

    public CompanyProcessingException(String message) {
        super(message);
    }
}
