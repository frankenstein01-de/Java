package ueReaderWriter;

import java.io.*;

public class DateiSchreiben {
    public static void main(String[]args){
        toUpperCaseDateiSchreiber("namen.txt");
    }
    public static void toUpperCaseDateiSchreiber(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))){
            String zeile;
            while((zeile=br.readLine())!=null){
                bw.write(zeile);
                bw.flush();
                bw.newLine();
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
