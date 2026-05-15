package Listue;

import java.util.ArrayList;
import java.util.List;

public class Pruefung {
    private String fach;
    private double note;

    public Pruefung(String fach,double note){
        this.fach=fach;
        this.note=note;
    }
    public String getFach(){
        return fach;
    }
    public double getNote(){
        return note;
    }

    public static void main(String[]args){
        Pruefung m1 = new Pruefung("Mathe",2.3);
        Pruefung m2 = new Pruefung("Mathe",5.0);
        Pruefung d = new Pruefung("Deutsch",3.0);
        Pruefung d2 = new Pruefung("Deutsch",4.0);
        double summeM =0;
        double summeD =0;
        double summeMal= 0;
        double summeDal=0;
        double mSize=0;
        double dSize=0;

        List<Pruefung> mathe = new ArrayList<>();
        List<Pruefung> allePruefungen = new ArrayList<>();
        allePruefungen.add(m1);
        allePruefungen.add(m2);
        allePruefungen.add(d);
        allePruefungen.add(d2);

        for(Pruefung alle:allePruefungen){
            if(alle.getFach().equals("Mathe")){
                summeMal = summeMal+alle.getNote();
                mSize++;
            }else{
                summeDal=summeDal+alle.getNote();
                dSize++;
            }
        }
        Pruefung beste = allePruefungen.get(0);
        for(Pruefung all:allePruefungen){
            if (all.getNote()<beste.getNote()){
                beste =all;
            }
        }
        System.out.println("Die beste note war im Fach:"+beste.getFach()+" mit der Note: "+beste.getNote());
        summeMal=summeMal/mSize;
        summeDal=summeDal/dSize;
        if (summeMal<summeDal)System.out.println("Mathe hat den besseren Schnitt mit: "+summeMal);
        else System.out.println("Deutsch hat den besseren Schnitt mit: "+summeDal);
        System.out.println("Liste alle^");


        mathe.add(m1);
        mathe.add(m2);
        for(Pruefung a: mathe){
            summeM = summeM+a.getNote();
        }
        summeM =summeM/mathe.size();
        System.out.println("Mathe Durchnitt = "+summeM);
        List<Pruefung> deusch= new ArrayList<>();
        deusch.add(d);
        deusch.add(d2);
        for(Pruefung a: deusch){
            summeD=summeD+a.getNote();
        }
        summeD=summeD/deusch.size();
        System.out.println("Deutsch Durchnitt = "+summeD);

        if(summeD<summeM){
            System.out.println("Deutsch hat den besseren Durchschnitt mit: "+summeD);
        }else if(summeD==summeM){
            System.out.println("Beide haben den gleich Durchschnitt");
        }else{
            System.out.println("Mathe hat den besseren Durchschnitt mit: "+summeM);
        }
    }
}
