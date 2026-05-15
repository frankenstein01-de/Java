package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionUe {
    public static void main(String[]arsg){
        List<String> bBrothers = List.of("Burt","Bronsik","Peter");
        bBrothers.stream()
                .map(name -> {return name.toUpperCase();})
                .forEach(n->System.out.println(n));


        bBrothers.stream().map(name-> name.length()).forEach(count->System.out.println(count));
        bBrothers.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("B");
            }
        }).count();
        Function<String, Predicate<String>> letterFilert = letter->(name->name.startsWith(letter));
        bBrothers.stream().filter(letterFilert.apply("B")).forEach(n-> System.out.println(n));
        List<String> list = bBrothers.stream().filter(letterFilert.apply("P")).collect(Collectors.toList());
        System.out.println(list);

    }
}


