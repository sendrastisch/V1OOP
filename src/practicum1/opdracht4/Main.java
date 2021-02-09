package practicum1.opdracht4;

public class Main {
    public static void main(String[] args){
        int getal = 39;
        int i = 0;
        int totaal = 0;

        while(i <= getal){
            totaal += i;
            i++;
        }
        System.out.println("Totaal = " + totaal);
    }
}