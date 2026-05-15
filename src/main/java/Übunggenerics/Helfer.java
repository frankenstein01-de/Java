package Übunggenerics;

public class Helfer {
    public<T>void durckeEtwas(T ding){
        System.out.println(ding);
    }
    public static void main(String[]args){
        Helfer h = new Helfer();

        h.durckeEtwas("Hallo");
        h.durckeEtwas(100);
        h.durckeEtwas(true);
    }
}
