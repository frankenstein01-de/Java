package Listue;

import java.util.HashMap;
import java.util.Map;

public class Telefonbuch {
    public static void main(String[]args){
    Map<String, String> teleBuch = new HashMap<>();
    teleBuch.put("Max","0176-12345");
    teleBuch.put("Torben","0175-12367");
    teleBuch.put("Jannis","01234-231321");
    String jNummer =teleBuch.get("Jannis");
    System.out.println(jNummer);
    for(Map.Entry<String,String> alle:teleBuch.entrySet()){
        System.out.println("Name: "+alle.getKey()+" |Nummer: "+alle.getValue());
    }


    }
}
