package gepuffert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ungepuffert {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String datei = scanner.nextLine();
        try{
            long startTime = System.nanoTime();
            FileInputStream fis = new FileInputStream(datei);
            FileOutputStream fos = new FileOutputStream("test1.txt");
            int b;
            while((b=fis.read())!=-1){
                fos.write(b);
            }
            fis.close();
            fos.close();
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(duration);

        }catch(FileNotFoundException e){
            System.out.println("Datei konnte nicht gefunden werden");
        }
        catch (IOException e){
            System.out.println("Ein Fehler beim Lesen oder Schreiben ist aufgetreten: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
