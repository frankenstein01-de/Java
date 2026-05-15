package Übunggenerics;

public class Tresor<T>{
    private T inhalt;

    public Tresor(T inhalt){
        this.inhalt=inhalt;
    }
    public T getInhalt(){
        return inhalt;
    }
    public static void main(String[]args){
        Tresor<Integer> a = new Tresor<>(2000);
        System.out.println(a.getInhalt());

    }
}
