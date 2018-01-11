package zadanie25;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[21];
        Random r = new Random();
        int Low = 1;
        int High = 10;
        int Guess;
        for (int i = 0; i <= 19; i++) {
            tab[i] = r.nextInt(High - Low) + Low;
        }
        for (int i = 0; i < tab.length - 1; i++)
            System.out.print(" " + tab[i]);
        System.out.println();

        int count[] = new int[20];
        for(int i = 0; i < 20; i++) {
            count[tab[i]]++;
        }

        for(int i = 0; i < 20; i++) {
            if(count[i] > 1)
                System.out.println(i+"-"+count[i]);
        }






    }
}