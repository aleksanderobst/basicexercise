package zadanie6;

public class Main {
    public static void main(String[] args) {
        double ocena_matematyka = 3;
        double ocena_chemia = 5;
        double ocena_j_polski = 3;
        double ocena_j_angielski = 3;
        double ocena_wos = 3;
        double ocena_informatyka = 2;
        double mean;

        String przedmiot = "";
        int number = 6;
        int nr = 3;
        int nr2 = 3;

        mean = (ocena_matematyka+ocena_chemia+ocena_j_polski+ocena_j_angielski+ocena_wos+ocena_informatyka)/number;

        System.out.printf("średnia wszystkich ocen to: %.2f", mean);

        System.out.println();

        mean = (ocena_matematyka+ocena_chemia+ocena_informatyka)/nr;

        System.out.printf("średnia ocen z przedmiotów ścisłych to: %.2f", mean);

        System.out.println();

        mean = (ocena_j_polski+ocena_j_angielski+ocena_wos)/nr;

        System.out.printf("średnia ocen z przedmiotów humanistycznych to: %.2f", mean);

        if (ocena_matematyka == 2){
            przedmiot = "Matematyka";
            System.out.println();
            System.out.println(" Ocena z "+przedmiot+" niedostateczna");
        }
        if (ocena_chemia == 2){
            przedmiot = "Chemia";
            System.out.println();
            System.out.println(" Ocena z "+przedmiot+" niedostateczna");
        }
        if (ocena_j_polski == 2){
            przedmiot = "Polski";
            System.out.println();
            System.out.println(" Ocena z "+przedmiot+" niedostateczna");
        }
        if (ocena_j_angielski == 2){
            przedmiot = "Angielski";
            System.out.println();
            System.out.println(" Ocena z "+przedmiot+" niedostateczna");
        }
        if (ocena_wos == 2){
            przedmiot = "Wos";
            System.out.println();
            System.out.println(" Ocena z "+przedmiot+" niedostateczna");
        }
        if (ocena_informatyka == 2){
            przedmiot = "Informatyka";
            System.out.println();
            System.out.println(" Ocena z "+przedmiot+" niedostateczna");
        }
        if (mean < 3.0 ){
            System.out.println("Srednia to dwa, ocena z "+przedmiot+" niedostateczna");
        }




    }
}
