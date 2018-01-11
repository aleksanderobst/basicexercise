package zadanie8;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        double max =0;
        double min;
        double[] tab = new double[3];

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number 1");
        double numer1=sc.nextDouble();
        tab[0]= numer1;
        System.out.println("Enter number 2");
        double name=sc.nextDouble();
        tab[1]= name;
        System.out.println("Enter number 3");
        double fee=sc.nextDouble();
        tab[2]= fee;
        System.out.println("number 1 = "+numer1+" number 2 = "+name+" number 3 = "+fee);
        sc.close();

        //max
        double result = tab[0];
        for (int i=1; i<tab.length; i++) {
            if (result < tab[i]) {
                result = tab[i];
            }
        }
        System.out.println("Najwiekszy element w tablicy to " + result);

        //min
        result = tab[0];
        for (int i=1; i<3; i++) {
            if (result > tab[i]) {
                result = tab[i];
            }
        }
        System.out.println("Najmniekszy element w tablicy to " + result);

    }
}




