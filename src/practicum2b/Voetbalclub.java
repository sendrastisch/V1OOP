package practicum2b;

public class Voetbalclub {
    private String naam;
    private Integer aantalGewonnen = 0;
    private Integer aantalGelijk = 0;
    private Integer aantalVerloren = 0;


    public Voetbalclub(String nm) {
        naam = nm;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public Integer aantalPunten(){
        return (aantalGewonnen*3) + aantalGelijk;
    }

    public Integer aantalGespeeld(){
        return aantalGelijk + aantalVerloren + aantalGewonnen;
    }

    public String toString(){
        String s =  naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren+ " " + aantalPunten();
        return s;
    }
}
