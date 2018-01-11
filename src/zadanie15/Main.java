package zadanie15;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Liczba razy kiedy drukujemy Hello World");
        int rollno=sc.nextInt();



        System.out.println("Pobrana liczba to  "+rollno+" ");
        sc.close();
        for (int i=0; i<rollno; i++){
            System.out.println("Hello World");
        }

    }
}