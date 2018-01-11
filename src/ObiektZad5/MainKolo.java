package ObiektZad5;

public class MainKolo {
    public static void main(String[] args) {
        Kolo kolo = new Kolo(5);
        double wynik = kolo.obliczObwod(5);

        double wynik2 = kolo.obliczPole(5);
        System.out.println("Wylicz obwod " +wynik);
        System.out.println("Wylicz pole " +wynik2);
    }

}