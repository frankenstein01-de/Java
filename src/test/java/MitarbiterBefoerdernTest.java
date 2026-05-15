import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MitarbiterBefoerdernTest {
    @Test
    void angestellerAnlegen(){
        MitarbeiterBefoerdern.Angestellter a = new MitarbeiterBefoerdern.Angestellter("Max","Muster",10,2500,"25.09.2001");
        assertEquals("Max",a.getVorname());
        assertEquals("Muster",a.getNachname());
        assertEquals(10,a.getId());
        double g = a.getGrundGehalt()*a.getGehaltfaktor();
        assertEquals(g,a.getGehalt());
        assertEquals("25.09.2001",a.getGeburtsdatum());
        assertEquals(1,a.getGehaltfaktor());
        assertEquals(2500,a.getGrundGehalt());
    }
    @Test
    void abLeiter(){
        MitarbeiterBefoerdern.Abteilungsleiter j = new MitarbeiterBefoerdern.Abteilungsleiter("Jannis","Frankenstein",20,4000,"24.09.2001");
        assertEquals("Jannis",j.getVorname());
        assertEquals("Frankenstein",j.getNachname());
        assertEquals(20,j.getId());
        assertEquals(4000,j.getGrundGehalt());
        assertEquals("24.09.2001",j.getGeburtsdatum());
        assertEquals(2,j.getGehaltfaktor());
    }
    @Test
    void testBeförderung(){
        MitarbeiterBefoerdern.Abteilungsleiter j = new MitarbeiterBefoerdern.Abteilungsleiter("Jannis","Frankenstein",20,4000,"24.09.2001");
        MitarbeiterBefoerdern.Angestellter a = new MitarbeiterBefoerdern.Angestellter("Max","Muster",10,2500,"25.09.2001");
        double alterFaktor = a.getGehaltfaktor();
        j.befördern(a);
        assertEquals(alterFaktor*1.10,a.getGehaltfaktor());
    }
    @Test
    void abteilungsTest(){
        MitarbeiterBefoerdern.Angestellter a = new MitarbeiterBefoerdern.Angestellter("Max","Muster",10,2500,"25.09.2001");

        MitarbeiterBefoerdern.Angestellter b = new MitarbeiterBefoerdern.Angestellter("Max","Muster",10,2500,"25.09.2001");
        MitarbeiterBefoerdern.Abteilungsleiter j = new MitarbeiterBefoerdern.Abteilungsleiter("Jannis","Frankenstein",20,4000,"24.09.2001");
        MitarbeiterBefoerdern.Angestellter[] array = new MitarbeiterBefoerdern.Angestellter[10];
        MitarbeiterBefoerdern.Abteilung c = new MitarbeiterBefoerdern.Abteilung(j,array);

        c.addAngestellter(a);
        c.addAngestellter(b);

        assertEquals(a,array[0]);
        assertEquals(b,array[1]);
    }
}
