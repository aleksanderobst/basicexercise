package ObiektZad10;

import java.util.Arrays;
import java.util.Scanner;

public class Field {

    private int number = 10;
    private int licznik = 2;

    public Field() {
        this.number = number;
        this.licznik = licznik;
    }
    boolean[][] tablica = new boolean[number][number];
    public void printField() {




//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < number; j++) {
//                for (int k = 2; k < number; k++) {
//
//                    tablica[i][j] = false;
//
//
//                }
//            }
//        }


//        System.out.println();
//
//            Scanner odczyt = new Scanner(System.in);
//
//            System.out.println("Podaj współrzędna x pola");
//
//            x = odczyt.nextInt();
//            System.out.println("Podaj współrzędna y pola: ");
//
//            y = odczyt.nextInt();







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

    public void checkCell(int x, int y) {


                System.out.println();



            if (tablica[x-1][y-1]== false){
                tablica[x-1][y-1] = true;
            }
            else if (tablica[x-1][y-1]== true){
                System.out.println("komórka była sprawdzana");
            }




    }


}







    //
//    public static void main(String[] args) {
//        int licznik = 2;
//        int number = 10;
//
//        int twoD[][] = new int[4][];
//        twoD[0] = new int[1];
//        twoD[1] = new int[2];
//        twoD[2] = new int[3];
//        twoD[3] = new int[4];
//
//        System.out.println(Arrays.deepToString(twoD));
//        boolean[][] tablica = new boolean[number][number];
//
//        int x=0;
//        int y=0;
//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < number; j++) {
//                for (int k = 2; k < number; k++) {
//
//                    tablica[i][j] = false;
//
//
//                }
//            }
//        }
//        while (licznik > 0) {
//            licznik++;
//            System.out.println();
//
//            Scanner odczyt = new Scanner(System.in);
//
//            System.out.println("Podaj współrzędna x pola");
//
//            x = odczyt.nextInt();
//            System.out.println("Podaj współrzędna y pola: ");
//
//            y = odczyt.nextInt();
//
//
//
//
//
//                        tablica[x-1][y-1] = true;
//
//            System.out.println("  1 2 3 4 5 6 7 8 9 10");
//            for (int i = 0; i < number; i++) {
//
//                System.out.print(i+1+" ");
//
//                for (int j = 0; j < number; j++) {
//
//                    if(tablica[i][j]){
//
//                        System.out.print("+ " );
//                    }
//                    else {
//                        System.out.print("O ");
//                    }
//                }
//                System.out.println();
//            }
//
//        }
//
//
//    }









