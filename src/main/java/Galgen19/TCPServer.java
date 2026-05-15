package Galgen19;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[]args) throws IOException {
        String[] woerter ={"Java","Server","Programmieren"};
        int  zufall =(int)(Math.random()*3);
        String wort = woerter[zufall].toUpperCase();
        char[] w =wort.toCharArray();
        char[] vorschau = new char[wort.length()];
        for(int i =0;i< wort.length();i++)vorschau[i]='_';

        final int PORT = 5000;
        try(ServerSocket ss = new ServerSocket(PORT)){
            try(Socket connetion = ss.accept();
            ObjectInputStream ois = new ObjectInputStream(connetion.getInputStream());
            ObjectOutputStream oss = new ObjectOutputStream(connetion.getOutputStream())){
                String stand = new String(vorschau);
                oss.writeObject(new Nachricht(stand));
                oss.flush();
                while(true){
                    boolean treffer = false;


                    Nachricht erhalten =(Nachricht) ois.readObject();
                    char er = erhalten.inhalt.toUpperCase().charAt(0);
                    for(int i=0;i<wort.length();i++){
                        if(w[i]==er){
                            vorschau[i]=er;
                            treffer = true;
                        }
                    }
                    String statusText = treffer ? "Treffer! " : "Leider falsch! ";
                    String aktuellerStand = new String(vorschau);

                    if(new String(vorschau).equals(wort)){
                        oss.writeObject(new Nachricht("Sie haben gewonnen"));
                        oss.flush();
                    }else{
                        oss.writeObject(new Nachricht(statusText + " Aktuelles Wort: " + aktuellerStand));
                    }

                }
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}
