package Klasurvorbereitung.MonsterUndHeldnAufgabe;

import java.util.List;

public class Zauberer extends Held implements Zaubernde{
    private int zauberPunkte;

    public Zauberer(String name, int trefferpunkte, String rasse, int zauberPunkte) {
        super(name, trefferpunkte, rasse);
        this.zauberPunkte = zauberPunkte;
    }

    public int getZauberPunkte() {
        return zauberPunkte;
    }
    public void setZauberPunkte(int a){
        this.zauberPunkte=a;
    }


}
