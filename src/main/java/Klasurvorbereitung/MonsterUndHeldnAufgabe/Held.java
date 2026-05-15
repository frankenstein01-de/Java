package Klasurvorbereitung.MonsterUndHeldnAufgabe;

public class Held {
    private String name;
    private int trefferpunkte;
    private String rasse;

    public Held(String name, int trefferpunkte, String rasse){
        this.name=name;
        this.trefferpunkte=trefferpunkte;
        this.rasse=rasse;
    }
    public int getTrefferpunkte(){
        return trefferpunkte;
    }
    public String getName(){
        return name;
    }
    public String getRasse(){
        return rasse;
    }

}
