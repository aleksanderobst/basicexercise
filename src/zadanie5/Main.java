package zadanie5;


public class Main {
    public static void main(String[] args) {
        int waga = 50;
        int wzrost = 10;
        int wiek = 15;
        boolean mozna_wejsc = true;

        if (waga < 180 && wzrost > 150 && wzrost <220 && wiek>10 && wiek<80)

        {
            mozna_wejsc = true;

        } else

        {
            mozna_wejsc = false;
        }
        System.out.println("Można wejść na rollercoaster. " + mozna_wejsc);
        if (waga>180){
            System.out.println("Nie można wejść z powodu przekroczenia limitu wagowego");
        }
        else{
            System.out.println("Waga jest prawidłowa");
        }
        if (wiek<10 || wiek >80){
            System.out.println("nie można wejść z powodu przekroczenia limitu wiekowego");
        }
        else{
            System.out.println("Wiek jest odpowiedni");
        }
    }
}
