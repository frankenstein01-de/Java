package gepuffert;

import java.io.*;
import java.util.Scanner;

public class bufferdStream {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ich suche gerade hier: " + new File(".").getAbsolutePath());
    try {
            String dateiName = scanner.nextLine();
            File quelldatei = new File(dateiName);


            if (!quelldatei.exists()) {
                System.out.println("STOPP: Die Datei '" + quelldatei.getAbsolutePath() + "' wurde nicht gefunden!");
                return; // Beendet das Programm, bevor der Fehler knallt
            }

            long startTime = System.nanoTime();

            try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(quelldatei));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test1.txt"))){
                int b;
                while ((b = bis.read()) != -1) {
                    bos.write(b);
                }
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println(duration);

    }catch(FileNotFoundException e){
        System.out.println("Fehler die Datei konnte nicht gefundne oder erstellt werden! ");
    }catch(IOException e){
        System.out.println("Ein Fehler beim Lesen oder Schreiben ist aufgetreten: " + e.getMessage());
    }



    }
}

