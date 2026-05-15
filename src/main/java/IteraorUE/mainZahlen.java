package IteraorUE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class mainZahlen {
    public static void main(String[]arsg){
      Zahlensammlung z1 =new Zahlensammlung();
      Iterator<Integer> it = z1.iterator();
      while(it.hasNext()){
          System.out.println(it.next());
      }
      PlayList p1=new PlayList();
      Iterator<String> itInt = p1.iterator();
      while(!it.hasNext()){
          System.out.println(itInt.next());
      }


    }
}
