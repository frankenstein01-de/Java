import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PersonTest {
    @Test
    void testPersonErfolgreich(){
        Person.Adresse a = new Person.Adresse("Hauptstraße", "12", 97070, "Würzburg");
        Person p = new Person("Max", "Muster", a);

        assertEquals("Max",p.getVorname());
        assertEquals("Muster",p.getNachname());
        assertEquals("Hauptstraße",p.getAdresse().getStrasse());
        assertEquals("12",p.getAdresse().getHausnummer());
        assertEquals(97070,p.getAdresse().getPostleitzahl());
        assertEquals("Würzburg",p.getAdresse().getOrt());
    }
    @Test
    void vKlein(){
        Person.Adresse a = new Person.Adresse("Hauptstraße", "12", 97070, "Würzburg");
        assertThrows(RuntimeException.class,()->{
            new Person("max","Muster",a);
        });
    }
    @Test
    void nKlein(){
        Person.Adresse a = new Person.Adresse("Hauptstraße", "12", 97070, "Würzburg");
        assertThrows(RuntimeException.class,()->{
            new Person("Max","muster",a);
        });
    }
    @Test
    void sKlein(){
        assertThrows(RuntimeException.class,()->{
            new Person.Adresse("hauptstraße", "12", 97070, "Würzburg");
        });

    }
    @Test
    void oKlein(){
        assertThrows(RuntimeException.class,()->{
            new Person.Adresse("Hauptstraße", "12", 97070, "würzburg");
        });

    }
    @Test
    void hKlein(){
        assertThrows(RuntimeException.class,()->{
            new Person.Adresse("Hauptstraße", "a2", 97070, "Würzburg");
        });
    }

}
