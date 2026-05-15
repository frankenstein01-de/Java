package Klasurvorbereitung.Schreibgeschäft;

public class main {
    public static void main(String[] args) {
            // 1. Warenkorb erstellen
            Warenkorb meinKorb = new Warenkorb();

            // 2. Artikel anlegen (Preise in Cent)
            Artikel füller = new Artikel("Edel-Füller", 2500, Artikel.ArtikelKategorie.Stift);
            Artikel heft = new Artikel("Matheheft", 250, Artikel.ArtikelKategorie.Schreibware);
            Artikel kordel = new Artikel("Goldkordel", 500, Artikel.ArtikelKategorie.Zierkordel);

            // 3. Artikel in den Warenkorb legen
            meinKorb.addArtikel(füller, 1); // 2500 Cent
            meinKorb.addArtikel(heft, 2);   // 500 Cent
            meinKorb.addArtikel(kordel, 1); // 500 Cent
            // Zwischensumme: 3500 Cent

            // 4. Rabattaktionen hinzufügen

            // Beispiel A: Ein fester Rabatt von 200 Cent (als Lambda)
            meinKorb.addRabataktion((wk) -> 400);

            // Beispiel B: Ein Rabatt, der speziell eine Kategorie kostenlos macht
            // Wir nutzen deine Methode gesamtPreisKategorie!
            meinKorb.addRabataktion((wk) -> wk.gesamtPreisKategorie(Artikel.ArtikelKategorie.Zierkordel));

            // 5. Endergebnis berechnen
            // Wir rufen die apply-Methode auf und übergeben den Korb an sich selbst
            int endpreis = meinKorb.apply(meinKorb);

            // 6. Ausgabe
            System.out.println("Gesamtpreis ohne Rabatt: " + meinKorb.gesamtPreisWarenkorb() + " Cent");
            System.out.println("Preis nach kategorie Stift "+ meinKorb.gesamtPreisKategorie(Artikel.ArtikelKategorie.Stift)+" cent ");
            System.out.println("Endpreis nach allen Rabatten: " + endpreis + " Cent");
            System.out.println("Das sind " + (endpreis / 100.0) + " Euro.");
    }
}

