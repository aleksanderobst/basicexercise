package zadanie13;
import java.util.Scanner;
public class Main {


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita numer 1 mniejsza od liczby nr 2");
        int rollno=sc.nextInt();
        System.out.println("Podaj liczbe nr 2, wiekszą od pierwszej");
        int rollno2=sc.nextInt();


        System.out.println("Dobrze liczba nr 2 jest większa: "+rollno+" "+rollno2);
        sc.close();



        int i = rollno;
        int suma = rollno;
        while ( i<rollno2){

            i++;
            suma = suma + i;
        }


        System.out.println(suma);
        suma = 0;
        for( i=rollno;i<=rollno2;i++)
        {


            suma =  suma+i;

        }

        System.out.print(suma);


    }
}
