package Netzwerkgalgen;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

public class TCPClient {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        final int PORT = 5000;
        final String HOST ="localhost";
        try(Socket conntionToServer = new Socket(HOST,PORT);
            InputStream is = conntionToServer.getInputStream();
            OutputStream os = conntionToServer.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(conntionToServer.getInputStream()));
            PrintWriter pw = new PrintWriter(os,true)){
            System.out.println("Verbindung zum Spielserver hergestellt!");
            String vomServer = br.readLine();
            System.out.println(vomServer);
            while(true){
                System.out.println("Dein Buchstabe");
                String eingabe = scanner.nextLine();
                pw.println(eingabe);


                vomServer = br.readLine();
                if(vomServer==null)break;
                System.out.println(vomServer);
                if(vomServer.equals("Gewonnen")){
                    System.out.println(vomServer);
                    break;
                }

            }






        }catch(Exception e){
        e.printStackTrace();

        }


    }
}
