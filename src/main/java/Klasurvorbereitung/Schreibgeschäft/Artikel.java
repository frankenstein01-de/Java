package Klasurvorbereitung.Schreibgeschäft;

public class Artikel {

        String name;
        int preisInCents;
        ArtikelKategorie kategorie;
        public Artikel(String name, int preisInCents, ArtikelKategorie kategorie) {
            this.name = name;
            this.preisInCents = preisInCents;
            this.kategorie = kategorie;
        }
        public ArtikelKategorie getKategorie(){
            return kategorie;
        }
    public enum ArtikelKategorie {
        Schreibware, Zierkordel, Buch, Stift

    }
}
