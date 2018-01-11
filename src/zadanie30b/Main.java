package zadanie30b;
import java.util.Scanner;
public class Main {





        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String slowo = sc.next();

            System.out.println("Odwrocony: " + odwrocString(slowo));
        }

        public static String odwrocString(String doOdwrocenia) {
            if (doOdwrocenia.length() <= 1) { // jesli do odwrocenia jest 1 litera
                return doOdwrocenia;
            } else {
                char ostatniZnak = doOdwrocenia.charAt(doOdwrocenia.length() - 1);
                // utnij ostatni znak
                String pozostaleZnaki = doOdwrocenia.substring(0, doOdwrocenia.length() - 1);

                System.out.println("Ostatni znak = " + ostatniZnak + "; reszta = " + pozostaleZnaki);
                String wynik = ostatniZnak + odwrocString(pozostaleZnaki);
                System.out.println("Konkatenacja= " + wynik);
                return wynik;
            }
        }
    }



