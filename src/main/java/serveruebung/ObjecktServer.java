package serveruebung;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class ObjecktServer {
    public static void main(String[]args){
        String[]woerter ={"Java","Server","Client"};
        int zufall=(int)(Math.random()*3);
        String wort=woerter[zufall].toUpperCase();
        char[] wortC=wort.toCharArray();
        char[] raten = new char[wort.length()];
        for (int i = 0;i< raten.length;i++){
            raten[i]='_';
        }
        int PORT =5000;
        try(ServerSocket serverSocket = new ServerSocket(PORT)){
            try(Socket socket = serverSocket.accept();
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())){
                Nachricht msgServer = new Nachricht("Server","Das zu erratenen wort ist "+ String.valueOf(raten));
                oos.writeObject(msgServer);
                oos.flush();

                while(true){
                    boolean treffer = false;
                    Nachricht antwort =(Nachricht) ois.readObject();
                    char gegbenBuch =antwort.inhalt.toUpperCase().charAt(0);
                    for (int i = 0;i< raten.length;i++){
                        if (gegbenBuch==wortC[i]){
                            raten[i]=gegbenBuch;
                            treffer=true;
                        }
                    }if(Arrays.equals(raten,wortC)){
                        oos.writeObject(new Nachricht("Server","Gewonnen das wort war: "+wort));
                        oos.flush();
                        break;
                    }else{
                        String status = treffer? "Treffer! ": "Leider kein Treffer ";
                        msgServer = new Nachricht("Server", status +" Stand "+String.valueOf(raten));
                        oos.writeObject(msgServer);
                        oos.flush();
                    }

                }



            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
