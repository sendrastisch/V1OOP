package practicum2.opdracht1;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br, double ln, double dp){
        breedte = br;
        lengte = ln;
        diepte = dp;
    }

    public Zwembad(){}

    public double getBreedte(){return breedte;}
    public double getLengte(){return lengte;}
    public double getDiepte(){return diepte;}
    public void setBreedte(double br){breedte = br;}
    public void setLengte(double ln){lengte = ln;}
    public void setDiepte(double dp){diepte = dp;}

    public double inhoud(){
        return lengte*breedte*diepte;
    }

    public String toString(){
        String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + "meter diep";
        return s;
    }
}
