package zadanie10;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dochód");
        double rollno = sc.nextDouble();
        if (rollno < 85528){
             double podatek = (rollno*0.18)-556.02;
            System.out.println("Podatek wynosi: " + podatek);
        }
        else if (rollno > 85528){
            double podatek = 14839.02+((rollno-85528)*0.32);
            System.out.println("Podatek wynosi: " + podatek);
        }

        System.out.println("Dochód wynosi: " + rollno );
        sc.close();

    }
}
