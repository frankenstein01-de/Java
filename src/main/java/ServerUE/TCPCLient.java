package ServerUE;

import java.io.*;
import java.net.Socket;

public class TCPCLient {
    public static void main(String[]args){
        final int PORT = 5000;
        final String HOST ="localhost";
        try(Socket connectionToServer =new Socket(HOST,PORT);
            OutputStream os = connectionToServer.getOutputStream();
            InputStream is = connectionToServer.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os))){
            String greeting = br.readLine();
            System.out.println(greeting);

            String zahlenListe ="1,2,3,4,5,6,7,8,9,10,11,12";
            bw.write(zahlenListe);

            bw.newLine();
            bw.flush();

            String response;
            while((response=br.readLine()) !=null){
                System.out.println(response);

            }





        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
