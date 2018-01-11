package zadanie9;
import java.util.Scanner;
public class Main {




    public static void main(String[] args) {
        int waga;
        int wzrost;
        int wiek;
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj wage");
        waga=sc.nextInt();
        System.out.println("Podaj wzrost");
        wzrost=sc.nextInt();
        System.out.println("Podaj wiek");
        wiek=sc.nextInt();
        System.out.println("waga:"+waga+" wzrost:"+wzrost+" wiek:"+wiek);
        sc.close();

        boolean mozna_wejsc = true;

        if (waga < 180 && wzrost > 150 && wzrost <220 && wiek>10 && wiek<80)

        {
            System.out.println("Można wejść");

        } else

        {
            System.out.println("Nie można wejść");
        }
        // System.out.println("Można wejść na rollercoaster. " + mozna_wejsc);
        if (waga>180){
            System.out.println("Nie można wejść z powodu przekroczenia limitu wagowego");
        }
        else{
            System.out.println("Waga jest prawidłowa");
        }
        if (wiek<10 || wiek >80){
            System.out.println("nie można wejść z powodu przekroczenia limitu wiekowego");
        }
        else{
            System.out.println("Wiek jest odpowiedni");
        }
        if (wzrost<220 && wzrost >150){
            System.out.println("Wzrost prawidłowy");
        }
        else{
            System.out.println("Wzrost nie prawidłowy poza limitem");
        }
    }
}
