package Studenten;

public class Main{
    public static void main(String[]args){
        Personen[] p = new Personen[100];
        for(int i=0;i< p.length;i++){
            if(i%2==0){
                p[i]= new Student("Programmieren");
            }else{
                p[i]=new Professor("Programmieren");
            }
        }
        for(int i=0;i< p.length;i++){
            System.out.println(p[i].gibTeatigkeitAus());
        }
    }
}
