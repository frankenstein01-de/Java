package Threadue;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    List<Integer> speicher = new ArrayList<>();
    private int max=5;
    public WareHouse(List<Integer> speicher){
        this.speicher=speicher;

    }
    public synchronized void addItem(int value) throws InterruptedException {
        while(speicher.size()>=max){
            System.out.println("Lager voll");
            wait();
        }
        speicher.add(value);
        System.out.println("Produziert: "+value);

        notifyAll();
    }
    public synchronized void removeItem()throws InterruptedException{
        while(speicher.isEmpty()){
           System.out.println("Lager ist Leer");
           wait();
        }
        int enterfernen = speicher.remove(0);
        System.out.println("Entfernt: "+enterfernen+" Lager: "+speicher.size());
        notifyAll();
    }
    public static void main(String[]args){
        List<Integer> speicher =new ArrayList<>();
        WareHouse a1 = new WareHouse(speicher);
        Producer p1 = new Producer(a1);
        Consumer<String> c1 = new Consumer<String>(a1);
        Thread pro = new Thread(p1);
        Thread con = new Thread(c1);
        pro.start();
        con.start();
    }
}
