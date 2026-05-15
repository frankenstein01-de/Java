package Klasurvorbereitung.MonsterUndHeldnAufgabe;

public class Monster {
    private String name;
    private int trefferpunkte;
    private String rasse;

    public Monster(String name, int trefferpunkte,String rasse){
        this.name=name;
        this.trefferpunkte=trefferpunkte;
        this.rasse=rasse;
    }
    public String getName(){
        return name;
    }
    public String getRasse(){
        return rasse;
    }
    public int getTrefferpunkte() {
        return trefferpunkte;
    }
}
