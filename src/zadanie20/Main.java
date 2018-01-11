package zadanie20;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Gra w ”Za dużo, za mało”");
        Random r = new Random();
        int Low = 0;
        int High = 100;
        int Guess;
        int Result = r.nextInt(High - Low) + Low;

        do {
            System.out.println("Podaj numer: ");

            Guess = odczyt.nextInt();
            if (Guess < Result){
                System.out.println("Podałeś za małą wartość");
            }
            if (Guess > Result){
                System.out.println("Podałeś za dużą wartość");
            }
            if (Result == Guess){
                System.out.println("Gratulacje.");

            }

        }while(Result != Guess);
        // dopoki ktos nie wpisze 0
    }
}
