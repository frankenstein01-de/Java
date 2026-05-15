package le19ue;

import le21.Question;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generickstack<T> {
    Knoten<T> start;

    public void push(T element){
        if(element==null)return;
        Knoten<T> neuerKnoten = new Knoten<>(element);
        neuerKnoten.next=start;
        start=neuerKnoten;
    }
    public T pop(){
        if(start==null)return null;

        T wert = start.element;
        start= start.next;
        return wert;
    }
    public static class Knoten<T>{
        T element;
        Knoten<T> next;
        public Knoten(T element){
            this.element=element;
        }
    }
    public static void main(String[]args){
        Generickstack<String> s=new Generickstack<>();
        s.push("Hallo");
        s.push("Welt");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}
