package Listue;

import java.util.ArrayList;
import java.util.List;

public class NamenFabrik {
    public static void main(String[]args){


    List<String> namenklein =List.of("max", "anna", "lukas", "beate");
    List<String> namenGroß =new ArrayList<>();

    for(String n: namenklein){
        String neu=n.toUpperCase();
        namenGroß.add(neu);
    }
    for(String n: namenGroß){
        System.out.println(n);
    }


    }
}
