package zadanie22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner odczyt = new Scanner(System.in);
        int record=0;
        System.out.println("Podaj liczbę ");
        record = odczyt.nextInt();
        System.out.println(record);
        System.out.println("Dzielnik to: ");
        for (int i=1;i<=record;i++){

            if (record%i==0){
                System.out.print(i +" ");
            }
        }

    }
}