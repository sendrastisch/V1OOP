package practicum4a;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft){
        naam = nm;
        leeftijd = lft;
    }

    public String toString(){
        String s = naam + "; leeftijd " + leeftijd + " jaar.";
        return s;
    }

}
