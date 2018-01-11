package Zadanie17;
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        int number; //w nim zapiszemy swoje number
        System.out.println("Podaj liczbe wiekszą od zera: ");
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika

        number = odczyt.nextInt();

        if (number>0){
        System.out.println("Podany numer to "+number); //wyświetlamy powitanie
        }
        else {
            System.out.println("Liczba nieprawidłowa mniejsza od zera");
            System.out.println("Podaj liczbe wiekszą od zera: ");


            number = odczyt.nextInt();
        }
        int i=0;
        double potega = 0;
        int licznik=0;
        for (i=0; i<number;i++){
            potega = pow(2, i);
            if (potega<number){
                System.out.println(potega);

            }

        }




        }

}
