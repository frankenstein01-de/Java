package Klasurvorbereitung.Twotter;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID =1l;
    private String passwort;
    private final String benutzerName;

    public User(String passwort,String benutzerName){
        this.benutzerName=benutzerName;
        this.passwort=passwort;
    }

}
