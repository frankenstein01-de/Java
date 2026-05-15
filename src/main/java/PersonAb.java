public abstract class PersonAb {
    String fach;
    public PersonAb(String fach){
        this.fach=fach;

    }
    public abstract String gibFachAus();

    public String getFach(){
        return fach;
    }

    public static class Student extends PersonAb{
        public Student(String fach){
            super(fach);
        }
        @Override
        public String gibFachAus(){
            return "Der Student besucht das Fach "+ fach+".";
        }
    }
    public static class Professor extends PersonAb{
        public Professor(String fach){
            super(fach);
        }
        @Override
        public String gibFachAus(){
            return "Der Professor unterrichtet das Fach "+ fach+".";
        }
    }
    public static void main(String[]args){
        PersonAb[] personen =new PersonAb[100];
        for(int i=0;i< personen.length;i++){
            if(i%2==0){
                personen[i]=new Student("Programmieren");
            }else{
                personen[i]=new Professor("Programmieren");
            }
        }
        for(int i = 0;i< personen.length;i++){
            System.out.println(personen[i].gibFachAus());
        }
    }

}
