package l18UE4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.GZIPInputStream;

public class Server {
    public static void main(String[]args){
        final int PORT = 5000;
        try(ServerSocket ss = new ServerSocket(PORT);
            Socket connection = ss.accept();
            // 1. Hol den rohen Stream
            InputStream is = connection.getInputStream();
            // 2. Dekoriere ihn mit GZIP (entpackt die Daten "on the fly")
            GZIPInputStream gzis = new GZIPInputStream(is);
            // 3. Dekoriere ihn weiter mit BufferedReader (macht Text daraus)
            BufferedReader br = new BufferedReader(new InputStreamReader(gzis))) {
            System.out.println("Client verbunden. Empfange Daten:");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
