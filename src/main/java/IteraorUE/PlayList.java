package IteraorUE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PlayList implements Iterable<String> {
    private List<String> meinePlaylist = new ArrayList<>(Arrays.asList("Eazy-E","2 Pack","Biggi"));

    @Override
    public Iterator<String> iterator(){
        return new PlaylistIterator();
    }
    private class PlaylistIterator implements Iterator<String>{
        int index = meinePlaylist.size()-1;
        @Override
        public boolean hasNext(){
            return index >=0;

        }
        @Override
        public String next(){
            if(!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            String song = meinePlaylist.get(index);
            index--;
            return song;

        }
    }

}
