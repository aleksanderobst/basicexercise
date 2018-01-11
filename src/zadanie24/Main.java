package zadanie24;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[11];
        Random r = new Random();
        int Low = -10;
        int High = 10;
        int Guess;
        for (int i = 0; i <= 10; i++) {
            tab[i] = r.nextInt(High - Low) + Low;
        }
        for (int i = 0; i < tab.length - 1; i++)
            System.out.print(" " + tab[i]);
        System.out.println();
        //max
        double max = tab[0];
        for (int i = 1; i < tab.length - 1; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }

        System.out.println("Max:" + max);
        //min
        double min;
        min = tab[0];
        for (int i = 1; i < tab.length - 1; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        System.out.println("Min:" + min);
        double mean = 0;
        double number = tab.length - 1;
        double tablicaSuma = 0;
        for (int i = 0; i < tab.length - 1; i++) {

            tablicaSuma = tablicaSuma + tab[i];
            mean = (tablicaSuma) / number;
        }

        System.out.printf("średnia wszystkich ocen to: %.2f\n", mean);
        int counterMin = 0;
        int counterMax = 0;
        int i = 0;
        for (i = 0; i < 10; i++){
            if (tab[i] < mean) {
                counterMin = counterMin + 1;
            } else {
                counterMax++;
            }
        }
        System.out.println(counterMin);
        System.out.println(counterMax);

        for (i = 9; i >= 0 ; i--)
            System.out.print(" " + tab[i]);
        System.out.println();

    }
}