package ObiektZad5;

public class Main {
    public static void main(String[] args) {


        Kwadrat kwadrat = new Kwadrat(5);
        int wynikObwod = kwadrat.obliczObwod(5);
        int wynikPole = kwadrat.obliczPole(5);
        System.out.println("Wylicza obwod: "+wynikObwod);
        System.out.println("Wylicza pole: "+wynikPole);
    }

}
