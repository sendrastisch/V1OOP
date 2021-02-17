package practicum2b;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub f;
    private Integer aantalGewonnen;
    private Integer aantalGelijk;
    private Integer aantalVerloren;
    private Integer aantalPunten;

    @Test
    void legeClubnaam() {
        System.out.println("legeClubnaam");
        Voetbalclub f = new Voetbalclub("");
        assertEquals("FC", f.getNaam(), "Fout");
    }
    @Test
    void verwerkResulatenNietFoutief() {
        System.out.println("verwerkResulatenNietFoutief");
        Voetbalclub U = new Voetbalclub("Utrecht");
        U.verwerkResultaat('w');
        U.verwerkResultaat('w');
        U.verwerkResultaat('w');
        U.verwerkResultaat('g');
        assertEquals(10, U.aantalPunten(), "Fout");
    }
    @Test
    void aantalGespeeldNietFoutief() {
        System.out.println("aantalGespeeldNietFoutief");
        Voetbalclub A = new Voetbalclub("AZ");
        A.verwerkResultaat('w');
        A.verwerkResultaat('w');
        A.verwerkResultaat('w');
        A.verwerkResultaat('g');
        assertEquals(4, A.aantalGespeeld(), "Fout");
    }
    @Test
    void toStringTesten() {
        System.out.println("toStringTesten");
        Voetbalclub F = new Voetbalclub("Feijenoord");
        F.verwerkResultaat('w');
        F.verwerkResultaat('w');
        F.verwerkResultaat('w');
        F.verwerkResultaat('g');
        assertEquals("Feijenoord 4 3 1 0 10", F.toString(), "Fout");
    }
    @Test
    void testHerhaaldelijk() {
        System.out.println("testHerhaaldelijk");
        Voetbalclub B = new Voetbalclub("Bob");

        B.verwerkResultaat('w');
        assertEquals(3, B.aantalPunten(), "Fout");
        B.verwerkResultaat('w');
        assertEquals(6, B.aantalPunten(), "Fout");
        B.verwerkResultaat('v');
        assertEquals(6, B.aantalPunten(), "Fout");
        B.verwerkResultaat('g');
        assertEquals(7, B.aantalPunten(), "Fout");

        B.verwerkResultaat('w');
        assertEquals(3, B.getAantalGewonnen(), "Fout");
        B.verwerkResultaat('w');
        assertEquals(4, B.getAantalGewonnen(), "Fout");

        B.verwerkResultaat('v');
        assertEquals(2, B.getAantalVerloren(), "Fout");
        B.verwerkResultaat('v');
        assertEquals(3, B.getAantalVerloren(), "Fout");

        B.verwerkResultaat('g');
        assertEquals(2, B.getAantalGelijk(), "Fout");
        B.verwerkResultaat('g');
        assertEquals(3, B.getAantalGelijk(), "Fout");
    }
}

