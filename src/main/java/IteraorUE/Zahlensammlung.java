package IteraorUE;

import Klasurvorbereitung.AufgabeFahrzeug.Elektrofahrzeug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Zahlensammlung implements Iterable<Integer> {
    List<Integer> zahlen =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,9,10,11,12));


    @Override
    public Iterator<Integer> iterator() {
        return new ZahlensammlungIterator();
    }

    private class ZahlensammlungIterator implements Iterator<Integer>{
        private int index =0;

        @Override
        public boolean hasNext(){
            while(index< zahlen.size()&&zahlen.get(index)%2!=0){
                index++;
            }
            return index<zahlen.size();
        }
        @Override
        public Integer next(){
            if (!hasNext()) {
                throw new java.util.NoSuchElementException("Keine weiteren geraden Zahlen!");
            }
            int ergebnis = zahlen.get(index);
            index++;
            return ergebnis;


        }
    }


}

