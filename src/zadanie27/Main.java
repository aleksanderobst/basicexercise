package zadanie27;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int licznik = 2;
        int number;

        while (licznik > 0) {
            licznik++;
            System.out.println();
            System.out.println("Podaj numer: ");
            Scanner odczyt = new Scanner(System.in);
            number = odczyt.nextInt();


            for (int i = 1; i < number + 1; i++) {
                System.out.print("\n");
                for (int j = 1; j < number + 1; j++) {
                    System.out.printf("%5d", i *j );
                }
            }
        }

    }
}






