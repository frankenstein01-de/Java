package ServerUE;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer extends Thread {
    public static void main(String[]args){
        final int PORT = 5000;
        try(ServerSocket ss = new ServerSocket(PORT)){
            System.out.println("Warten auf Verbindungsanfrage Zzzz");

            while(true){
                Socket clientSocket = ss.accept();
                Thread helfer = new Thread(new ClientHandler(clientSocket));
                helfer.start();


            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
