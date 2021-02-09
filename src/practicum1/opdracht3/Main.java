package practicum1.opdracht3;

public class Main {
    public static void main(String args[])
    {
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + 1;
            System.out.println(rand);
        }
    }
}
