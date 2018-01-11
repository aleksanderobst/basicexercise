package ObiektZad11;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2a {
private int sum;

//ObiektZad11.ArrayList<Double> m = new ObiektZad11.ArrayList<Double>();


    public Arraylist2a() {
        this.sum = sum;
    }


    public static int addElementsForEach() {
        //tworzymy tablicę
        List<Integer> lista = new ArrayList<Integer>();
        //dodajemy elementy typu Object - czyli dowolne, my dodamy ciągi znaków
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(3);

        //sprawdzamy rozmiar listy
        //System.out.println("Rozmiar listy to: "+lista.size());

        //na koniec przypiszmy pierwszy element listy zmiennej imie i wyświetlmy go
        //musimy użyć rzutowania, ponieważ inaczej próbowalibyśmy przypisać Object do String
        int imie = (Integer)lista.get(0);
        //  System.out.println("Pierwszy element listy to: "+imie);

        int i;
        int sum = 0;
        for(i = 0; i < lista.size(); i++)
            sum += lista.get(i);
        System.out.println("suma");


        //for each
        sum = 0;
        for(int x : lista)
            sum +=x;

        return sum;
        }

    public static int  multiplyElementsForEach() {
        //tworzymy tablicę
        List<Integer> lista = new ArrayList<Integer>();
        //dodajemy elementy typu Object - czyli dowolne, my dodamy ciągi znaków
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(3);

        //sprawdzamy rozmiar listy
        //System.out.println("Rozmiar listy to: "+lista.size());

        //na koniec przypiszmy pierwszy element listy zmiennej imie i wyświetlmy go
        //musimy użyć rzutowania, ponieważ inaczej próbowalibyśmy przypisać Object do String
        int imie = (Integer) lista.get(0);
        //  System.out.println("Pierwszy element listy to: "+imie);
        int sum = 0;
        sum = 1;
        for (int i = 0; i < lista.size(); i++)
            sum *= lista.get(i);
        System.out.println("iloczyn");

        //for each
        sum = 1;
        for (int x : lista)
            sum *= x;

        return sum;
    }


    public static double meanElementsForEach() {
        //tworzymy tablicę
        List<Integer> lista = new ArrayList<Integer>();
        //dodajemy elementy typu Object - czyli dowolne, my dodamy ciągi znaków
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(3);

        //sprawdzamy rozmiar listy
        //System.out.println("Rozmiar listy to: "+lista.size());

        //na koniec przypiszmy pierwszy element listy zmiennej imie i wyświetlmy go
        //musimy użyć rzutowania, ponieważ inaczej próbowalibyśmy przypisać Object do String
        int imie = (Integer)lista.get(0);
        //  System.out.println("Pierwszy element listy to: "+imie);
        double sum;
        sum = 0;
        for(int i = 0; i < lista.size(); i++)
            sum += lista.get(i);
        System.out.println("średnia arytmetyczna");

        //for each
        sum = 0;
        for(int x : lista)
            sum +=x;
        double y = sum/lista.size();

        return y;
    }
//
//
//
//    public static int meanElements(int[] tablica2 ) {
//        int sum = 0;
//        for (int i = 0; i < tablica2.length; i++) {
//            sum += tablica2[i];
//
//        }
//        return sum;
//    }
//
//    public static int meanElements(ArrayList<Integer> tablica2 ) {
//        int sum = 0;
//        for (int i = 0; i < tablica2.size(); i++) {
//            Integer elementTablicy = tablica2.get(i);
//            sum *= elementTablicy;
//
//        }
//        return sum;
//    }
//
//    public static int meanElementsArraylist(ArrayList<Integer> tablica2 ) {
//        int sum = 0;
////        // wartosci : 19 18 17 16 15 14 13 12 11
////        for (Integer wartosc : lista) {
////            System.out.println("Element: " + wartosc);
//////            int indeks = lista.indexOf(wartosc);
//int mean = 0;
//        for (Integer elementTablicy : tablica2 ) {
//            sum += elementTablicy;
//            System.out.println("Element: " + mean);
//        }
//        mean = sum/tablica2.size();
//        return mean;
//    }
//
//
//
//    public static void reverseBooleanElementsArraylist(ArrayList<Boolean> tablica2 ) {
//
//
//
//        for (int i = 0; i < 4; i++) {
//
//            if (tablica2.get(i)== true){
//                tablica2.add(false);
//            }else {
//                tablica2.add(true);
//            }
//            System.out.println(tablica2.get(i));
//
//        }
//
//
//
//    }




    }


