package Zadanie12;


import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Podaj liczbę całkowita dodatnią");
        int rollno=sc.nextInt();
        System.out.println(rollno);

        System.out.println("Podaj liczbę całkowita dodatnią - dolny zakres");
        int rollno2=sc.nextInt();
        System.out.println(rollno);

        System.out.println("Podaj liczbę całkowita dodatnią - górny zakres");
        int rollno3=sc.nextInt();
        System.out.println(rollno);

        sc.close();
        System.out.print("Liczba to: ");
        for (int i=0; i<=rollno; i++){
            if (i%2 ==1) {
                System.out.print(i+"  ");
            }
            else{}
        }
        //========================
        System.out.println();
        System.out.println("Liczby od 3 do 100 podzielne przez 3 i 5");
        //=====================================
        rollno = 100;
        System.out.println();
        for (int i=3; i<rollno; i++){
            if (i%3 == 0) {
                System.out.print(i+"  ");
            }
            else if (i == 0){
                continue;
            }
            else{}
        }
        //====================================
        rollno = 100;
        System.out.println();
        for (int i=3; i<rollno; i++){
            if (i%5 ==0) {
                System.out.print(i+"  ");
            }
            else{}
        }
        System.out.println();
        System.out.println("Liczba podzielna przez 6:  ");
        for (int i=rollno2;i<rollno3;i++){
            if (i%6 == 0){
                System.out.print(i+ " ");
            }



        }





    }
}