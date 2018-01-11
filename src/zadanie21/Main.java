package zadanie21;

import java.util.Scanner;

public class Main {


        public static void main(String[] args)
        {
            Scanner odczyt = new Scanner(System.in);
            int i,j,k;
            int record=6;
            System.out.println("Podaj liczbę wierszy choinki");
            record = odczyt.nextInt();
            System.out.println("Ilosc wierszy to "+record);
            for(i=1; i<=record; i++)
            {
                for(j=20; j>=i; j--)
                {
                    System.out.print(" ");
                }
                for(k=1; k<=(2*i-1); k++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

