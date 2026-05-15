package ServerUE;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable{
    private final Socket clientSocket;

    public ClientHandler(Socket socket){
        this.clientSocket=socket;
    }
    @Override
    public void run(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter pr = new PrintWriter(clientSocket.getOutputStream(),true)){
            pr.println("Sende eine Liste von Zahlen getrennt durch Komma");

            String input = br.readLine();
            if(input!=null){
                String[] numbers = input.split(",");
                StringBuilder response = new StringBuilder("Ergebnis: ");
                for(String n: numbers){
                    try {
                        int num = Integer.parseInt(n.trim());
                        boolean prim = isPrim(num);
                        response.append(num).append(prim ? " ist Primzahl " : " keine Primzahl ");
                    }catch (NumberFormatException e){
                        response.append(numbers).append("Ungültig");
                    }
                }
                pr.println(response.toString());

            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    private boolean isPrim(int n){
        if(n<=1) return false;
        for(int i =2; i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
