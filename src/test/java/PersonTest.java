import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PersonTest {
    @Test
    void personAnlegen(){
        Person.Adresse a = new Person.Adresse("Lang","1a",97070,"Würzburg");
        Person j= new Person("Max","Tee",a);

        assertEquals("Max",j.getVorname());
        assertEquals("Tee",j.getNachname());
        assertEquals("Lang",j.getAdresse().getStrasse());
        assertEquals("1a",j.getAdresse().getHausnummer());
        assertEquals("Würzburg",j.getAdresse().getOrt());
    }
    @Test
    void vklein(){
        Person.Adresse a = new Person.Adresse("Lang","1a",97070,"Würzburg");
        assertThrows(RuntimeException.class,()->new Person("max","Tee",a));
    }
    @Test
    void nKlein(){
        Person.Adresse a = new Person.Adresse("Lang","1a",97070,"Würzburg");
        assertThrows(RuntimeException.class,()->new Person("Max","tee",a));
    }
    @Test
    void sKlein(){
        assertThrows(RuntimeException.class,()->new Person.Adresse("lang","1a",97070,"Würzburg"));
    }
    @Test
    void oKlein(){
        assertThrows(RuntimeException.class,()->new Person.Adresse("Lang","1a",97070,"würzburg"));
    }
    @Test
    void hKeineZiffer(){
        assertThrows(RuntimeException.class,()->new Person.Adresse("Lang","aa",97070,"würzburg"));
    }

}
