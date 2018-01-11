package zadanie16;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int licznik = 2;
        int number;

        while(licznik>0){
            licznik++;
            System.out.println("Podaj numer: ");
            Scanner odczyt = new Scanner(System.in);
            number = odczyt.nextInt();


            System.out.println("Hello World");
            if (number<0){
                break;
            }
        }



    }
}
