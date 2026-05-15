package Klasurvorbereitung.Schachbrettaufgabe;

import java.util.Iterator;

public class mainSchach {
    public static void main(String[]args){
        Schachbrett s = new Schachbrett();
        for(char feld:s){
            System.out.println(feld+" ");
        }
        Iterator<Character> it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        String sb = s.toString();
        System.out.println(sb);
    }
}
