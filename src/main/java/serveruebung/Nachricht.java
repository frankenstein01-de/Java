package serveruebung;

import java.io.Serializable;

public class Nachricht implements Serializable {
    public static final long serialVersionUID = 1l;
    public String sender;
    public String inhalt;
    public Nachricht(String sender,String inhalt){
        this.inhalt=inhalt;
        this.sender=sender;
    }
}
