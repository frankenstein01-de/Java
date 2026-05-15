package serveruebung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPclientUe {
    public static void main(String[]args){
        int PORT = 5000;
        String hostname ="localhost";
        try(Socket socket = new Socket(hostname,PORT);
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))){

            output.println("Hallo server,ich bin der Client!");
            String response = input.readLine();
            System.out.println("Antwort vom Server: "+response);


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
