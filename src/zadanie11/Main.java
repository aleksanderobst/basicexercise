package zadanie11;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        System.out.println("To jest podstawowy kalkulator i obsługuje + - * /");


                int liczba1,liczba2;
                //w nim zapiszemy swoje imie
                char operacja;
                Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
                System.out.println("Podaj pierwszą liczbę");
                liczba1 = odczyt.nextInt();
        System.out.println("Podaj drugą liczbę");
        odczyt = new Scanner(System.in);
        liczba2 = odczyt.nextInt();
        System.out.println("Podaj symbol operacji arytmetycznej");
        odczyt = new Scanner(System.in);
        operacja = odczyt.next().charAt(0);
        System.out.println();

        switch(operacja)     // w zależności od wyboru wykonujemy daną operację
        {
            case '+':    // dodawanie dwóch zmiennych
            {
                System.out.println(liczba1 + liczba2);
                break;
            }
            case '-':    // odejmowanie dwóch zmiennych
            {
                System.out.println(liczba1 - liczba2);
                break;
            }
            case '*':    // mnożenie dwóch zmiennych
            {
                System.out.println(liczba1 * liczba2);
                break;
            }
            case '/': {


                if(liczba2 !=0)
                {
                    System.out.println("OK ");
                    System.out.println(liczba1 / liczba2);
                }
                else
                {
                    System.out.println("Nie dzielimy przez zero!!!");
                }
                break;// sprawdzenie, czy druga zmienna nie jest zerem oraz
            }}}}
