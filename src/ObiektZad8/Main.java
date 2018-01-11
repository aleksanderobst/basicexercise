package ObiektZad8;

import java.util.Scanner;

public class Main {

        public static void main(String[] args){
           QuadraticEquation quad = new QuadraticEquation();
            double A,B,C; //w nim zapiszemy swoje imie
            double delta = 0;
            Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
            System.out.println("Podaj liczby A B C w celu rozwiązania równania kwadratowego");
            A = odczyt.nextDouble();
            B = odczyt.nextDouble();
            C = odczyt.nextDouble();
            if (quad.calculateDelta( A, B, C)>0){
                System.out.println("x1 "+ quad.calculateX1(A,B,C));
                System.out.println("x2 "+ quad.calculateX2(A,B,C));
            }
            else if (quad.calculateDelta( A, B, C) == 0){
                System.out.println("x0 "+ quad.calculateX3(A,B,C));
            }
            else if ((quad.calculateDelta( A, B, C)) < 0) {
                System.out.println("nie ma pierwiastkow ");
            }


        }
    }


