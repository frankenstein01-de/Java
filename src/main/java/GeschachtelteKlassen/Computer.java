package GeschachtelteKlassen;

public class Computer {
    private String name;

    public Computer(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public class Festplatte{
        private String name;

        public Festplatte(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void ausgabe(){
            System.out.println("Die Festplatte "+this.getName()+ " ist im Computer: "+Computer.this.getName());
        }


    }
    public static void main(String[]args){
        Computer a= new Computer("Nate Higgers");
        Computer.Festplatte b= a.new Festplatte("Corsair");
        b.ausgabe();
    }

}
