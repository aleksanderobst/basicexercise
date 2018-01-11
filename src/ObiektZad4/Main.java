package ObiektZad4;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println();
        int wynik = calc.addTwoNumbers(6,7);

        System.out.println("Wynik dodawania: " + calc.addTwoNumbers(6,7));

        int wynik2 = calc.substractTwoNumbers(6,7);
        System.out.println("Wynik odejmowania " + wynik2);
        calc.multiplyTwoNumbers(5,5);
        System.out.println("Wynik mnożenia: " + calc.multiplyTwoNumbers(5,5));
        calc.divideTwoNumbers(25,5);
        System.out.println("Wynik dzielenia: " + calc.divideTwoNumbers(25,5));
    }
}
