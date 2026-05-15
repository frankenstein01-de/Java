import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MitarbiertTest {
    @Test
    void setMitarbeirt(){
        Mitarbeiter  a = new Mitarbeiter("Max","Tee","24.09.2001",10,2500,1);
        assertEquals("Max",a.getVorname());
        assertEquals("Tee",a.getNachname());
        assertEquals("24.09.2001",a.getGeburtsdatum());
        assertEquals(10,a.getId());
        assertEquals(2500,a.getGrundGehalt());
        assertEquals(1,a.getGehaltsfaktor());
    }
    @Test
    void setLeiter(){
        Mitarbeiter.Abteilungsleiter a = new Mitarbeiter.Abteilungsleiter("Max","Tee","24.09.2001",10,2500);
        assertEquals("Max",a.getVorname());
        assertEquals("Tee",a.getNachname());
        assertEquals("24.09.2001",a.getGeburtsdatum());
        assertEquals(10,a.getId());
        assertEquals(2500,a.getGrundGehalt());
        assertEquals(2,a.getGehaltsfaktor());
    }
    @Test
    void beförder(){
        Mitarbeiter  a = new Mitarbeiter("Max","Tee","24.09.2001",10,2500,1);
        Mitarbeiter.Abteilungsleiter b = new Mitarbeiter.Abteilungsleiter("Max","Tee","24.09.2001",10,2500);
        b.befördern(a);
        assertEquals(1*1.10,a.getGehaltsfaktor());
    }
    @Test
    void abteilungTest(){
        Mitarbeiter  a = new Mitarbeiter("Max","Tee","24.09.2001",10,2500,1);
        Mitarbeiter.Abteilungsleiter b = new Mitarbeiter.Abteilungsleiter("Jannis","Frankenstein","24.09.2001",10,2500);
        Mitarbeiter.Abteilung f = new Mitarbeiter.Abteilung(10,b);
        f.addAnges(a);
    }


}
