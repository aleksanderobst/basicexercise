package zadanie11d;

import java.util.Random;

public class Random43 {
    public static void main(String[] args) {


        int[] tab = new int[10];
        Random r = new Random();
        int Low = 1;
        int High = 9;
        int Guess;
        for (int i = 0; i <= tab.length; i++) {
            tab[i] = r.nextInt(High - Low) + Low;
        }
        for (int i = 0; i < tab.length; i++)
            System.out.print(" " + tab[i]);
        System.out.println();

        int count[] = new int[9];
        for (int i = 0; i < tab.length; i++) {
            count[tab[i]]++;
        }

        for (int i = 0; i < tab.length; i++) {
            if (count[i] > 1)
                System.out.println(i + "-" + count[i]);
        }

    }
}
