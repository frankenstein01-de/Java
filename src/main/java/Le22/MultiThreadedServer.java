package Le22;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MultiThreadedServer implements Runnable {
    private Socket verbindung;
    public MultiThreadedServer(Socket s){
        this.verbindung=s;
    }
    public static void main(String[]args){
        final int PORT = 5000;
        try(ServerSocket ss = new ServerSocket(PORT)){
            System.out.println("Server gestartet");
            while(true){
                Socket s = ss.accept();
                MultiThreadedServer arbeiter = new MultiThreadedServer(s);
                Thread t = new Thread(arbeiter);
                t.start();
            }

        }catch(IOException e){
            e.printStackTrace();
        }


    }
    public static boolean isPrim(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    @Override
    public void run(){
        try(InputStream is = verbindung.getInputStream();
            OutputStream os  = verbindung.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            String nachricht = br.readLine();
            String[] zahl = nachricht.split(",");
            List<Integer> zahlen = new ArrayList<>();
            for(int i = 0;i< zahl.length;i++){
                int a = Integer.parseInt(zahl[i].trim());
                zahlen.add(a);
            }
            for(Integer z:zahlen){
               boolean test=  isPrim(z);
               String ergebnis ="Die ist die Zahl: "+z+" ein Primzahl?: "+test;
               bw.write(ergebnis);
               bw.newLine();
               bw.flush();
            }
            bw.write("Test ende");
            bw.newLine();
            bw.flush();
            System.out.println("Empfangen "+ nachricht);
            verbindung.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
