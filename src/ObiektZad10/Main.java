package ObiektZad10;
import java.util.Scanner;
public class Main {
    public static void main( String[] args ) {
        Field field = new Field();
        int c = 2;

        while (c > 0) {
            System.out.println("Podaj komende, printField lub checkCell");
            String komenda; //w nim zapiszemy swoje imie
            Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika

            komenda = odczyt.next();

            System.out.println("Komenda to " + komenda);
            //wyświetlamy powitanie

            String pf = "printField";
            String cc = "checkCell";
            if (komenda.equals(pf)) {
                field.printField();
            } else if (komenda.equals(cc)) {
              //  Scanner odczyt = new Scanner(System.in);

                System.out.println("Podaj współrzędna x pola");

                int x = odczyt.nextInt();
                System.out.println("Podaj współrzędna y pola: ");

                int y = odczyt.nextInt();
                field.checkCell(x,y);
            }
            else {
                System.out.println("Zła komenda koniec programu");
                break;
            }
        }
    }
}