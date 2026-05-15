package Galgen19;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        final int PORT = 5000;
        final String HOST ="localhost";
        try(Socket conntionToServer = new Socket(HOST,PORT);
            ObjectOutputStream oos = new ObjectOutputStream(conntionToServer.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(conntionToServer.getInputStream())) {

            while(true){
                Nachricht serverAnt =(Nachricht) ois.readObject();
                System.out.println("Server: "+serverAnt.inhalt);
                if(serverAnt.inhalt.equals("Sie haben gewonnen")){
                    break;
                }
                System.out.println("Dein Buchstabe: ");
                String eingabe = scanner.nextLine();
                oos.writeObject(new Nachricht(eingabe));
                oos.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
