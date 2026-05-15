package serveruebung;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class OpbjecktClient {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        int PORT =5000;
        String HOST ="localhost";

        try(Socket socket = new Socket(HOST,PORT)){
            try(ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())){
                Nachricht antwort =(Nachricht) ois.readObject();
                System.out.println("Der "+antwort.sender+" sagt "+ antwort.inhalt);
                while(true){
                    System.out.println("Dein Buchstabe: ");
                    String raten = scanner.nextLine();
                    if(raten.isEmpty()) continue;
                    oos.writeObject(new Nachricht("Client",raten));
                    oos.flush();
                    antwort =(Nachricht)ois.readObject();
                    System.out.println(antwort.inhalt);
                    if(antwort.inhalt.contains("Gewonnen")){
                        System.out.println("Spiel beendet.");
                        break;
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
