package com.swarup.Dependency;

public class Main {
    public static void main(String[] args) {
        EmailDAO emailDAO = new EmailDAO();
        //dependency
        //we can have as many dependencies

        EmailService emailService = new EmailService(emailDAO);
                                                      //injection
    }
}
