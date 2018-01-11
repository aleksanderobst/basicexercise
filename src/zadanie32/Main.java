package zadanie32;

public class Main {
    public static void main( String[] args ) {


    String a = "Ala ma 1 psa i 2 koty. Jola ma 10 rym i 2 papugi";
    int sum = 0;
    int evenSum = 0;
 for (char c : a.replaceAll("\\D", "").toCharArray()) {
        int digit = c - '0';
        sum += digit;
        if (digit % 2 == 0) {
            evenSum += digit;
        }
    }
 System.out.println("Wynik "+sum);

    }
}
