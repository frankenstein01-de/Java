package le20ue;

import java.util.List;

public class karten {
    private final Farbe farbe;
    private final Wert wert;
    public karten(Farbe farbe, Wert wert){
        this.wert=wert;
        this.farbe=farbe;
    }
    public Farbe getFarbe(){
        return farbe;
    }
    public Wert getWert(){
        return wert;
    }
    @Override
    public String toString(){
        return getFarbe()+" "+getWert();
    }
}
