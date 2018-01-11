package ObiektZad4;

import java.util.Scanner;

public class MainA {
        public static void main(String[] args) {
                Calculator calc = new Calculator();

                System.out.println();
            String string;
            String dodawanie = "dodaj";
            String odejmowanie = "odejmij";
            String mnozenie = "pomnóż";
            String dzielenie = "podziel";
            int number1;
            int number2;//w nim zapiszemy swoje imie
            System.out.println("Podaj operacje arytmetyczną dodaj odejmij pomnóż podziel");
            Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
            string = odczyt.nextLine();
            if (string.equals(dodawanie)){
            System.out.println("Dodawanie Podaj numer");
            number1 = odczyt.nextInt();
            System.out.println("Podaj numer2");
            number2 = odczyt.nextInt();
            //System.out.println("Witaj "+number1); //wyświetlamy powitanie
            System.out.println(calc.addTwoNumbers(number1,number2));
            }

            else if (string.equals(odejmowanie)){


                System.out.println("Odejmowanie Podaj numer");
                number1 = odczyt.nextInt();
                System.out.println("Podaj numer2");
                number2 = odczyt.nextInt();


            System.out.println(calc.substractTwoNumbers(number1, number2));


            string = odczyt.nextLine();}
            else if (string.equals(mnozenie)){
                System.out.println("Mnozenie Podaj numer");
                number1 = odczyt.nextInt();
                System.out.println("Podaj numer2");
                number2 = odczyt.nextInt();
            //System.out.println("Witaj "+number1); //wyświetlamy powitanie
            System.out.println(calc.multiplyTwoNumbers(number1,number2));
            string = odczyt.nextLine();
            }
            else if (string.equals(dzielenie)){
                System.out.println("Dzielenie Podaj numer");
                number1 = odczyt.nextInt();
                System.out.println("Podaj numer2");
                number2 = odczyt.nextInt();
            //System.out.println("Witaj "+number1); //wyświetlamy powitanie
            System.out.println(calc.divideTwoNumbers(number1,number2));
            }
        }
}
