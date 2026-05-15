package le21ue;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeeatherRecord {
    String datum;
    double temp;

    private WeeatherRecord(String datum,double temp){
        this.datum=datum;
        this.temp=temp;
    }
    public void processWeather(String fileName){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))){
            String line;
            while((line= reader.readLine())!=null){
                WeeatherRecord record = WeeatherRecord.fromCsv(line);
                System.out.println("Verarbeite Datum: "+record.datum+ " mit Temp "+record.temp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static WeeatherRecord fromCsv(String line){
        String[] parts = line.split(";");
        String date = parts[0];
        double temp = Double.parseDouble(parts[1]);
        return new WeeatherRecord(date,temp);
    }
}
