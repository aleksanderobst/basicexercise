package zadanie30A;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        String string;
        String imie; //w nim zapiszemy swoje imie
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika

        string = odczyt.nextLine();

        System.out.println("Witaj "+string); //wyświetlamy powitanie



        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);
    }
}
