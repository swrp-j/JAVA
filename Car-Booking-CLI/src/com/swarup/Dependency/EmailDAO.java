package com.swarup.Dependency;

public class EmailDAO {
    private  static final Email[] emails;
    static {
        emails = new Email[] {
                   new Email("sae@aaw.com"),
                   new Email("aweojv.awef@foe.com"),
                   new Email("waef.awe@oac.com")
                };
    }
    public Email[] getAllEmails(){
        return emails;
    }

}
