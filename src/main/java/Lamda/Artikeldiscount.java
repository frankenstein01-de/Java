package Lamda;

import java.util.Arrays;
import java.util.List;

public class Artikeldiscount {
    public static void main(String[]args){
        List<Double>  preise = Arrays.asList(10.0,20.0,30.0);

        preise.stream().forEach(p->System.out.println(p*0.7));
    }
}
