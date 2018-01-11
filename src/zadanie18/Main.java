package zadanie18;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Podaj liczbę");
        Scanner odczyt = new Scanner(System.in);
        int licznik2 = 0;
        licznik2 = odczyt.nextInt();
int licznik = 0;
        int number;
        int[] tab = new int[licznik2+1];
        while(licznik<licznik2) {
            licznik++;
            System.out.println("Podaj numer: ");

            tab[licznik] = odczyt.nextInt();

    }
        System.out.println("Kolejna komórka to: ");
        for (int i = 1; i < tab.length; i++)
            System.out.print( " "+ tab[i]);
        System.out.println();
        //max
        double result = tab[0];
        for (int i=1; i<tab.length; i++) {
            if (result < tab[i]) {
                result = tab[i];
            }
        }

        //min
        double result2;
        result2 = tab[1];
        for (int i=1; i<tab.length; i++) {
            if (result2 > tab[i]) {
                result2 = tab[i];
            }
        }


        System.out.println("suma najmniejszej i największej liczby to:  "+ (result+result2) );
        int suma = 0;
        for (int i=0;i<tab.length;i++){
            suma += tab[i];
        }
       // System.out.println("Suma tych liczb wynosi: "+suma);
        System.out.println("Srednia arytmetyczna wynosi "+(" "+(double)suma/licznik2));
    }
}

