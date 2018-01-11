package zadanie36;
import java.util.Scanner;
public class Main {

        public static void main(String[] args){
           double A,B,C; //w nim zapiszemy swoje imie
            double delta = 0;
            Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
            System.out.println("Podaj liczby A B C w celu rozwiązania równania kwadratowego");
            A = odczyt.nextDouble();
            B = odczyt.nextDouble();
            C = odczyt.nextDouble();
            delta = (B*B)-(4*A*C);
            if (delta>0){
                double x1,x2;
                x1=((-B-Math.sqrt(delta))/(2*A));
                x2=((-B+Math.sqrt(delta))/(2*A));
                System.out.println("Wartość x1 to: "+x1);
                System.out.println("Wartość x2 to: "+x2);
            }
            else if(delta<0){
                double x3;
                x3 = (-B)/(2*A);
                System.out.println("Wartość x0 to: "+x3);
            }
            else if(delta==0){
                System.out.println("Nie ma pierwiastków: ");
            }
            System.out.println("Liczby to  "+A+" "+B+" "+C+" "); //wyświetlamy powitanie


            System.out.println("Wartość delty to: "+ delta);

        }
    }

