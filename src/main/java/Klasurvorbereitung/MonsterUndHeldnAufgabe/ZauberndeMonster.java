package Klasurvorbereitung.MonsterUndHeldnAufgabe;

public class ZauberndeMonster extends Monster implements Zaubernde{
    private int zauberPunkte;

    public ZauberndeMonster(String name, int trefferpunkte,String rasse,int zauberpunkte){
        super(name,trefferpunkte,rasse);
        this.zauberPunkte=zauberpunkte;
    }
    @Override
    public void setZauberPunkte(int a){
        this.zauberPunkte=a;
    }
    @Override
    public int getZauberPunkte(){
        return zauberPunkte;
    }
}
