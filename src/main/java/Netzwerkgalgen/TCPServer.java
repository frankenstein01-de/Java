package Netzwerkgalgen;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[]args){
        String[] wörter ={"Java","Server","Programmieren"};
        int  zufall =(int)(Math.random()*3);
        String wort = wörter[zufall].toUpperCase();
        char[] w =wort.toCharArray();
        char[] vorschau = new char[wort.length()];
        for(int i =0;i< wort.length();i++){
            vorschau[i]='_';
        }
        final int PORT = 5000;
        try(ServerSocket ss = new ServerSocket(PORT);
        Socket connetion = ss.accept();
            InputStream is = connetion.getInputStream();
            OutputStream os = connetion.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            PrintWriter pw = new PrintWriter(os,true)){
            pw.println("Willkommen bei Galgenmänchen: "+ String.valueOf(vorschau));
            while(!String.valueOf(vorschau).equals(wort)){
                String input = br.readLine();
                if(input==null)break;
                char a = input.toUpperCase().charAt(0);
                for(int i=0;i<vorschau.length;i++){
                    if (a==w[i]){
                        vorschau[i]=a;
                    }
                }
                pw.println("Stand: "+String.valueOf(vorschau));


            }
            pw.println("Gewonnen");






        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
