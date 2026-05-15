import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die Puffer größe an die sie haben wollen");
        int pufferG;
        do{
            pufferG = scanner.nextInt();
            scanner.nextLine();


        }while(pufferG<=0);
        System.out.println("Geben sie die datei an die sie Kopieren wollen");
        String datei = scanner.nextLine();

        try{
            long start = System.nanoTime();
            FileInputStream fis = new FileInputStream(datei);
            FileOutputStream bos = new FileOutputStream("test1.txt");
            byte[] b = new byte[pufferG];
            int n;
            do{
                n=fis.read(b);
                if(n!=-1) bos.write(b,0,n);
            }while(n!=-1);
            fis.close();
            bos.close();
            long ende =System.nanoTime();
            long duration = ende-start;
            System.out.println(duration+" ns");

        }catch(FileNotFoundException e){
            System.out.println("Die Datei wurde nicht gefunden");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
