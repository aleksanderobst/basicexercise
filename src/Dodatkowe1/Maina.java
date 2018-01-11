package Dodatkowe1;

import java.util.Scanner;

public class Maina{
    public static void main(String[] args){
        int imie; //w nim zapiszemy swoje imie
        System.out.println("Podaj liczbę pięć razy");
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
       int silnia = 5;
        int[] tablica = new int[5];
       for (int i=0;i<5;i++){
           tablica[i] = odczyt.nextInt();

       }
       int sum = 0;
        int iloczyn = 1;

       for (int i = 0; i< 5; i++){
           System.out.print(" "+tablica[i]);
           sum = sum + tablica[i];

            iloczyn = iloczyn * tablica[i];
       }
        System.out.println();
        System.out.println("Suma liczb w tablicy =  "+sum);
        System.out.println();
        System.out.println("Srednia liczb w tablicy =  "+sum/tablica.length);
        System.out.println();
        System.out.println("Iloczyn liczb w tablicy =  "+iloczyn);
int sum2 = 0;
        for (int i=0; i<=10; i++){
            sum2 = sum2+i;
        }
        System.out.println("suma ciągu arytmetycznego to " +sum2);
        int ilo = 1;
        for (int i=1; i<=5; i++){
            ilo = ilo*i;
        }
        System.out.println("suma ciągu geometrycznego to " +ilo);

                int result = fact(7);

                System.out.println(result);
            }

            public static int fact(int n) {
if (n==7){
                System.out.println("Silnia z "+n);}
                if (n == 0) {
                    return 1;
                }

                return n * fact(n - 1);









    }
}