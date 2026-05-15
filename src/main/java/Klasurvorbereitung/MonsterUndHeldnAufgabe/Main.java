package Klasurvorbereitung.MonsterUndHeldnAufgabe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        Zauberer z1 = new Zauberer("Feodor",400,"Elf",13);
        List<Zaubernde> zauberer = new ArrayList<>();
        Zauberer z2 = new Zauberer("Anduin",300,"Mensch",178);
        ZauberndeMonster zm1= new ZauberndeMonster("Gorlok",400,"Ork",23);
        zauberer.add(z1);
        zauberer.add(z2);
        zauberer.add(zm1);
        halbiereZauberpunkte(zauberer);


        System.out.println(z1.getZauberPunkte()+"  "+z2.getZauberPunkte()+" "+zm1.getZauberPunkte());



    }
    public static void halbiereZauberpunkte(List<Zaubernde> z){
        for(Zaubernde zau:z){
            int neueMenge = zau.getZauberPunkte()/2;
            zau.setZauberPunkte(neueMenge);
        }

    }
}
