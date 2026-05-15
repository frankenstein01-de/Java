import java.util.Scanner;
public class Punkt {
    static int x;
    static int y;
    public static void verschiebePunkt(int zielX, int zielY) {
        if(zielY>1080||zielY<0){
            throw new RuntimeException("Die zielY darf nur im Bereich von 0-1080 sein!");
        }
        if(zielX>1980||zielX<0){
            throw new RuntimeException("Die zielX darf nur im Bereich von 0-1980 sein!");
        }
        x = zielX;
        y = zielY;
    }
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        while(true){
            try{
                int xEin=scanner.nextInt();
                int yEin=scanner.nextInt();

                verschiebePunkt(xEin,yEin);
                break;
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }


    }
}
