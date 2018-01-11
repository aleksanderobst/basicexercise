package zadanie26;
import java.util.Scanner;
public class Main {
    public static void main( String[] args ) {
        int n; //w nim zapiszemy swoje imie
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        System.out.println("Podaj numer ");
        n = odczyt.nextInt();

        System.out.println("Numer "+n); //wyświetlamy powitanie
        if (n<0){
            System.out.print("1.");
            int x = Math.abs(-n);
            System.out.println(Integer.toBinaryString(x));
        }
        else {
            System.out.println(Integer.toBinaryString(n));
        }

    }
}
