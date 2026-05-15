package Klasurvorbereitung.AufgabeIBAN;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckIban {
    public void checkIban(String iban){
        char[] cIban = iban.toCharArray();
        if(cIban[0]=='D'&&cIban[1]=='E'&&cIban.length==22){
           System.out.println("Gültige Deutsche IBAN");
        }else{
            throw new FalscheIBANException("Das ist keine Deutsche IBAN");
        }

    }
    public List<String> liesIbanAusDatei(String datei){
        List<String> nichtGueltig = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(datei))){
            String zeile = br.readLine();
            while((zeile)!=null){
                try{
                    checkIban(zeile);
                }catch (FalscheIBANException e){
                    nichtGueltig.add(zeile);
                }
                zeile = br.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return nichtGueltig;
    }
    public Map<String,List<String>> liesIbanAusDateien(String[] dateinamen){
        String aktuelleDatei;
        Map<String,List<String>> ausgabe= new HashMap<>();
        List<String> aktuelleDateiIbans = new ArrayList<>();
        for(int i=0;i<dateinamen.length;i++){
            aktuelleDatei=dateinamen[i];
            aktuelleDateiIbans=liesIbanAusDatei(aktuelleDatei);
            ausgabe.put(aktuelleDatei,aktuelleDateiIbans);
        }
        return ausgabe;

    }
}
