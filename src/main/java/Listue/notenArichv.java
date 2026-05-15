package Listue;

import java.util.HashMap;
import java.util.Map;

public class notenArichv {
    public static class Pruefungen{
        private String name;
        private double note;

        public Pruefungen(String name,double note){
            this.name=name;
            this.note=note;
        }
        public String getName(){
            return name;
        }
        public double getNote(){
            return note;
        }
    }
    public static void main(String[]args){
        Map<String,Pruefungen> archiv = new HashMap<>();

        Pruefungen p1 = new Pruefungen("Deutsch",2.1);
        Pruefungen p2 = new Pruefungen("Englisch",1.0);
        Pruefungen p3 = new Pruefungen("Mathe",3.0);
        archiv.put("Mathe",p3);
        archiv.put("Englisch",p2);
        archiv.put("Deutsch",p1);
        Pruefungen gefunden = archiv.get("Mathe");



        System.out.println(gefunden.getName()+" mit der note: "+ gefunden.getNote());


    }
}
