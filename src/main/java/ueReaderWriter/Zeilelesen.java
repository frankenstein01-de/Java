package ueReaderWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zeilelesen {
    public static void main(String[]args){
       try{
           printUppercase("namen.txt");
       }catch (IOException e){
           e.printStackTrace();
       }
    }public static void printUppercase(String filname)throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(filname))){
            String zeile;
            while((zeile=br.readLine())!=null){
                System.out.println(zeile.toUpperCase());
            }
        }

    }

}
