package zadanie31;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        String string;
        String imie; //w nim zapiszemy swoje imie
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika

        string = odczyt.nextLine();





        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);
       if (string.equals(reverse)){
           System.out.println("Jest palindromem");
       }
       else {
           System.out.println("Nie jest palindromem");
       }
       isPalindrome(string);

    }
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuffer().append(str).reverse().toString());
    }
}
