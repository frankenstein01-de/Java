package Listue;

import java.util.ArrayList;
import java.util.List;

public class DublettenJäger {
    public static void main(String[]args){
        List<Integer> zahlenDoppelt = List.of(1,2,3,3,4,4,5,5,6,1,2,3);
        List<Integer> ohneDoppelt= new ArrayList<>();

        for(Integer i: zahlenDoppelt){
            if(!ohneDoppelt.contains(i)){
                ohneDoppelt.add(i);
            }
        }
        for(Integer i: ohneDoppelt){
            System.out.println(i);
        }
    }
}
