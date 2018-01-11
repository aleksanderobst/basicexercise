package ObiektZad11;

import java.util.ArrayList;
import java.util.List;

public class Main {




    public static void main(String[] args){

        List<Integer> lista = new ArrayList<Integer>();
        //dodajemy elementy typu Object - czyli dowolne, my dodamy ciągi znaków
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(3);

        System.out.println(Arraylist2a.addElementsForEach());
        System.out.println(Arraylist2a.multiplyElementsForEach());
        System.out.println(Arraylist2a.meanElementsForEach());

        List<Boolean> lista2 = new ArrayList<Boolean>();

        Arraylist2b.negativeBool();
        Arraylist2b.AND();
        Arraylist2b.OR();
    }
}
//        //tworzymy tablicę
//        List<Integer> lista = new ArrayList<Integer>();
//        //dodajemy elementy typu Object - czyli dowolne, my dodamy ciągi znaków
//        lista.add(2);
//        lista.add(3);
//        lista.add(2);
//        lista.add(3);
//
//        //sprawdzamy rozmiar listy
//        //System.out.println("Rozmiar listy to: "+lista.size());
//
//        //na koniec przypiszmy pierwszy element listy zmiennej imie i wyświetlmy go
//        //musimy użyć rzutowania, ponieważ inaczej próbowalibyśmy przypisać Object do String
//        int imie = (Integer)lista.get(0);
//      //  System.out.println("Pierwszy element listy to: "+imie);
//
//        int i;
//        double sum = 0;
//        for(i = 0; i < lista.size(); i++)
//            sum += lista.get(i);
//        System.out.println("suma");
//        System.out.println(sum);
//
//        //for each
//        sum = 0;
//        for(int x : lista)
//            sum +=x;
//        System.out.println(sum);
//
//        sum = 1;
//        for(i = 0; i < lista.size(); i++)
//            sum *= lista.get(i);
//        System.out.println("iloczyn");
//        System.out.println(sum);
//        //for each
//        sum = 1;
//        for(int x : lista)
//            sum *=x;
//        System.out.println(sum);
//
//        sum = 0;
//        for(i = 0; i < lista.size(); i++)
//            sum += lista.get(i);
//        System.out.println("średnia arytmetyczna");
//        System.out.println(sum/lista.size());
//        //for each
//        sum = 0;
//        for(int x : lista)
//            sum +=x;
//        System.out.println(sum/lista.size());
//
//    }
//
//
//}