package l18UE4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPOutputStream;

public class Client {
    public static void main(String[]args){
        final int PORT =5000;
        final String HOST ="localhost";
        byte[] bytesToTransfer = "Hallo Welt\n".getBytes();
        try(Socket connectionToHost = new Socket(HOST,PORT);
            OutputStream os = connectionToHost.getOutputStream();
            // Hier wird der Decorator angewendet:
            GZIPOutputStream gzos = new GZIPOutputStream(os)) {

            System.out.println("Sende komprimierte Daten an den Server...");

            gzos.write(bytesToTransfer);

            // Optional: Ein explizites finish() schließt den GZIP-Vorgang ab,
            // falls man den Socket noch für etwas anderes offen halten wollte.
            gzos.finish();
            gzos.flush();

            System.out.println("Daten gesendet.");

        } catch (IOException e) {
            System.err.println("Client-Fehler: " + e.getMessage());
        }
    }
}


