package ueReaderWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BytesundZeichen {
    public static void main(String[]args){

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Bitte geben sie ihren namen ein");
             String name = br.readLine();
             if(name!=null){
                 System.out.println("Hallo "+name);
             }



        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
