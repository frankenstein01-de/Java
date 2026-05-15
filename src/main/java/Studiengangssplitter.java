import java.io.*;

public class Studiengangssplitter {
    public static void main(String[]args)throws IOException,MatrikelNummerException{
        splitStudiengaenge("MatrNR.txt");

    }
    public static void  splitStudiengaenge(String dateiname)throws IOException, MatrikelNummerException{
        try(BufferedReader br = new BufferedReader(new FileReader(dateiname));
            BufferedWriter bwWi = new BufferedWriter(new FileWriter("WInfNr.txt"));
            BufferedWriter bwIn = new BufferedWriter(new FileWriter("InfNr.txt"));
            BufferedWriter bwEC = new BufferedWriter(new FileWriter("ECNr.txt"));){

            String zeile;
            while((zeile=br.readLine())!=null) {
                int zahl = Integer.parseInt(zeile);

                if (zahl >= 5000000 && zahl <= 5099999) {
                    bwWi.write(zeile);
                    bwWi.newLine();

                } else if (zahl >= 5100000 && zahl <= 5199999) {
                    bwIn.write(zeile);
                    bwIn.newLine();

                } else if (zahl >= 6100000 && zahl <= 6199999) {
                    bwEC.write(zeile);
                    bwEC.newLine();

                } else {
                    throw new MatrikelNummerException("Falsche Matrikelnummer" + zahl);
                }
            }


            }catch(IOException e){
            e.printStackTrace();
        }


    }

}
