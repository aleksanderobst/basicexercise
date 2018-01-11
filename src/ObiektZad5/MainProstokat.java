package ObiektZad5;

public class MainProstokat {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(5,6);
        int wynik = prostokat.obliczObwod(4,5);
        int wynik2 = prostokat.obliczPole(4,5);
        System.out.println("Wylicz obwod " +wynik);
        System.out.println("Wylicz pole " +wynik2);
    }
}
