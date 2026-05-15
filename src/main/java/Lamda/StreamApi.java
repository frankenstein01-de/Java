package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApi {
    public static void main(String[]args){
        List<String> bBrothers = Arrays.asList("Burt","Bronski","Peter");

        bBrothers.stream().forEach(new Consumer<String>(){
            public void accept(String name){
                System.out.println(name);

            }
        });
        bBrothers.stream().forEach(name-> System.out.println(name));
    }
}
