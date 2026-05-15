package Listue;
import java.util.HashMap;
import java.util.Map;
public class Warenkorb {
    public static void main(String[]args){
        Map<String,Double> waren = new HashMap<>();
        waren.put("Apfel",0.50);
        waren.put("Brot",2.10);
        waren.put("Schokolade",1.20);
        double einkauf=waren.get("Apfel")+waren.get("Brot");
        for(Map.Entry<String,Double> war:waren.entrySet()){
            if (war.getKey().contains("Schokolade")){
                System.out.println("Der Preis für "+war.getKey()+" ist: "+war.getValue());}
        }
        System.out.println("Der Einkauf von Brot und Apfel kostet: "+einkauf);
    }
}
