package gepuffert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class bytearray {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String datei = scanner.nextLine();
        try{
            long startTime = System.nanoTime();
            FileInputStream fis = new FileInputStream(datei);
            FileOutputStream fos = new FileOutputStream("test1.txt");
            byte[]b = new byte[1024];
            int n;
            while((n= fis.read(b))!=-1){
                fos.write(b,0,n);
            }
            fis.close();
            fos.close();
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(duration);
        }catch(FileNotFoundException e){
            System.out.println("Datei nicht gefunden");

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
