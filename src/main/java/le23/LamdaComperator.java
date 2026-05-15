package le23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LamdaComperator {
    public static void main(String[]args){
        List<String> bBrother = Arrays.asList("Bronko","Better","Balu");
        bBrother.sort(Comparator.comparing(namen->namen));
        bBrother.forEach(m->System.out.println(m));

    }
}
