package Übunggenerics;

import java.net.URI;
import java.net.URL;
import java.util.Optional;

public class OptionalUebung {
    public static void main(String[]args){
        Optional<String> voll = Optional.of("Java");
        Optional<String> leer = Optional.empty();
        voll.ifPresent(s-> System.out.println("Inhalt: "+s));
        String ergebnis = leer.orElse("Leer");
        System.out.println(ergebnis);




    }
}
