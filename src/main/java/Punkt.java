import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Scanner;


public class Punkt {
    public static int x;
    public static int y;

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        while(true) {
            x = scanner.nextInt();
            y = scanner.nextInt();
        try{
            verschiebePunkt(x,y);
            break;
        }catch (RuntimeException e){
            System.out.println("Fehler !"+ e.getMessage());
            scanner.nextLine();
        }
        }

    }

    public static void verschiebePunkt(int zielX, int zielY) {

        if(zielX<0||zielX>1920) {
            throw new RuntimeException("X dar nicht Größer wie 1920 und nicht kleiner wie 0 sein ");

        }else if(zielY<0||zielY>1080){
            throw new RuntimeException("Y darf nicht größer wie 1080 und nicht kleiner wie 0 sein");
        }else{
            x=zielX;
            y=zielY;
        }
    }
}