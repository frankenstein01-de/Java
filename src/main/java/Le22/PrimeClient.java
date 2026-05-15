package Le22;
import java.io.*;
import java.net.*;
import java.util.*;

public class PrimeClient {
    public static void main(String[] args) {
        final int PORT = 5000;
        final String HOST = "localhost";
        try(Socket connectionToServer = new Socket(HOST,PORT)){
            OutputStream os = connectionToServer.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            InputStream is =connectionToServer.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            List<Integer> zahlen = new ArrayList<>();
            for(int i = 0;i<=100;i++){
                zahlen.add(i);
            }
            String listeALsString = zahlen.toString().replace("[","").replace("]","");
            bw.write(listeALsString); bw.newLine();
            bw.flush();
            while(true){
               String nachricht = br.readLine();
               if(nachricht.contains("ende")){
                   break;
               }else{
                   System.out.println(nachricht);
               }
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
