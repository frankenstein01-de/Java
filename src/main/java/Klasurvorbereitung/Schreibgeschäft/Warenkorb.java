package Klasurvorbereitung.Schreibgeschäft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warenkorb implements Rabattaktion {
    private Map<Artikel,Integer> warenkorb = new HashMap<>();
    private List<Rabattaktion> rabattaktionen = new ArrayList<>();

    public void addArtikel(Artikel a, int anzahl){
        warenkorb.put(a,anzahl);
    }
    public void addRabataktion(Rabattaktion r){
        rabattaktionen.add(r);
    }

    public int gesamtPreisKategorie(Artikel.ArtikelKategorie k){
        int gesamtPreisKat=0;
        for(Artikel a: warenkorb.keySet()){
            if(a.getKategorie()==k){
                gesamtPreisKat=gesamtPreisKat+(a.preisInCents*warenkorb.get(a));
            }
        }
        return gesamtPreisKat;

    }
    @Override
    public Integer apply(Warenkorb wk){
        double gesamt = gesamtPreisWarenkorb();
        for(Rabattaktion a:wk.rabattaktionen){
            int rabatt = a.apply(wk);
            gesamt=gesamt-rabatt;

        }
        return (int) Math.round(gesamt);

    }
    public int gesamtPreisWarenkorb(){
        int geamtPreis=0;
        for(Artikel a:warenkorb.keySet()){
            int anzahl = warenkorb.get(a);

                geamtPreis = geamtPreis + a.preisInCents*anzahl;
            }

        return geamtPreis;
    }
}
