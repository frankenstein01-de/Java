package serveruebung;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserverUe {
    public static void main(String[]args){
        int PORT = 5000;
        try(ServerSocket serverSocket = new ServerSocket(PORT)){
            while(true){
                try(Socket socket = serverSocket.accept();
                    BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter output = new PrintWriter(socket.getOutputStream(), true )){
                    System.out.println("Client verbunden");
                    String message = input.readLine();
                    System.out.println("Empfangen"+ message);
                    output.println("Server sagt: Nachricht erhalten");
                    output.println("Du kek");


                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
