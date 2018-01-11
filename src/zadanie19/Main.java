package zadanie19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner odczyt = new Scanner(System.in);
        int licznik2 = 100;

        int licznik = 0;
        int number;
        int[] tab = new int[licznik2];
        do {
            System.out.println("Podaj numer: ");

            tab[licznik] = odczyt.nextInt();

        }while(tab[licznik++] != 0);  // dopoki ktos nie wpisze 0
        System.out.println("Kolejna komórka to: ");
        for (int i = 0; i < licznik; i++)
            System.out.print( " "+ tab[i]);
        System.out.println();
        //max
        double max = tab[0];
        for (int i=1; i<licznik-1; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }

        System.out.println("Max:" + max);
        //min
        double min;
        min = tab[0];
        for (int i=1; i<licznik-1; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        System.out.println("Min:" + min);


        System.out.println("suma najmniejszej i największej liczby to:  "+ (max+min) );
        int suma = 0;
        for (int i=0;i<tab.length-1;i++){
            suma += tab[i];
            if (tab[i]==0){
                break;
            }
        }
        double suma2= 0;
        suma2 = (double)suma/(licznik-1);

        System.out.println("Suma tych liczb wynosi: "+suma);
        System.out.printf("Srednia arytmetyczna wynosi %.2f",+suma2);
    }
}