package zadanie28;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int licznik = 2;
        int number;

        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        System.out.println(Arrays.deepToString(twoD));

        int x=0;
        int y=0;

        while (licznik > 0) {
            licznik++;
            System.out.println();
            System.out.println("Podaj numer: ");
            Scanner odczyt = new Scanner(System.in);
            number = odczyt.nextInt();
            System.out.println("Podaj współrzędna x pola");

            x = odczyt.nextInt();
            System.out.println("Podaj współrzędna y pola: ");

            y = odczyt.nextInt();



            boolean[][] tablica = new boolean[number][number];

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    for (int k = 2; k < number; k++) {

                            tablica[i][j] = false;
                            tablica[x-1][y-1] = true;

                    }
                }
            }
            System.out.println("  1 2 3 4 5 6 7 8 9 10");
            for (int i = 0; i < number; i++) {

                System.out.print(i+1+" ");

                for (int j = 0; j < number; j++) {

                    if(tablica[i][j]){

                        System.out.print("+ " );
                    }
                    else {
                        System.out.print("O ");
                    }
                }
                System.out.println();
            }

        }


    }

}







