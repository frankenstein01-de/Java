package Listue;

import java.util.ArrayList;
import java.util.List;

public class Türsteher {

    public static void main(String[]args){
        List<Integer> verAlter = new ArrayList<>();
        List<Integer> volljährig=new ArrayList<>();
        int alter=0;
        for(int i=0;i<=24;i++){
            verAlter.add(alter);
            alter++;
        }
        for(Integer a:verAlter){
            if(a>=18){
                volljährig.add(a);
            }
            System.out.println(a);
        }
        System.out.println("Volljährig darf in den Club");
        for(Integer a:volljährig){
            System.out.println(a);
        }
    }
}
