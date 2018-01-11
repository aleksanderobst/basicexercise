package zadanie35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita numer 1 mniejsza od liczby nr 2");
        float rollno = sc.nextInt();
        System.out.println("Podaj liczbe nr 2, wiekszą od pierwszej");
        float rollno2 = sc.nextInt();
     //   System.out.println(rollno / rollno2);
     //   if (rollno2 <= 0) {
      //      System.out.println("Numer dwa mniejszy od zera");
            try {
                System.out.println(rollno / rollno2);
                System.out.println(rollno2<0);
            } catch (java.util.InputMismatchException e) {
                System.out.println("ZERO drugiego numeru: " + rollno2);
            }
            sc.close();
        }
    }
//}
