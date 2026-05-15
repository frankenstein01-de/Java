package Galgen19;

import java.io.Serializable;

public class Nachricht implements Serializable {
    private static final long serialVersionUID =1l;
    public String inhalt;
    public Nachricht(String inhalt){
        this.inhalt=inhalt;
    }
}
