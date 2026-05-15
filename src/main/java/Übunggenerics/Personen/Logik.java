package Übunggenerics.Personen;
public class Logik<K extends Kinder,P extends Person> {
    private K kinder;
    private P person;

    public Logik(K kinder,P person){
        this.kinder=kinder;
        this.person=person;
    }
    public void vergleiche(){
        if(this.kinder.alter>this.person.alter){
            System.out.println("Das kind ist älter wie die Person");
        }else{
            System.out.println("Die Person ist älter als das Kind");
        }
    }
    public static void main(String[]args){
        Kinder a = new Kinder(17);
        Person b = new Person(15);
        Logik<Kinder,Person> c = new Logik<>(a,b);

        c.vergleiche();
    }
}
