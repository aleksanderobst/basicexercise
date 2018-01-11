package zadanie23;

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Podaj numer:");
        //capture the input in an integer
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " jest liczbą pierwszą");
        else
            System.out.println(num + " nie jest liczbą pierwszą");
    }
}