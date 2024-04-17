package com.swarup.Dependency;

public class EmailService {
//    private EmailDAO emailDAO = new EmailDAO();
//    here we'll use dependency injection
    private  EmailDAO emailDAO;

    public EmailService(EmailDAO emailDAO) {
        this.emailDAO = emailDAO;
    }

    //get email
    public Email getEmail(String email){
        for (Email currentEmail : emailDAO.getAllEmails()) {
            if(email.equals(currentEmail.getEmail())){
                return currentEmail;
            }
        }
        throw new IllegalStateException("not found");
    }

}
