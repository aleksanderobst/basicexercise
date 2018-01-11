package zadanie11d;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {
        //tworzymy tablicę
        List<Integer> lista = new ArrayList<Integer>();
        int[] tablica = new int[8];
        //dodajemy elementy typu Object - czyli dowolne, my dodamy ciągi znaków
        lista.add(1);
        lista.add(2);
        lista.add(4);
        lista.add(2);
        lista.add(5);
        lista.add(12);
        lista.add(3);
        lista.add(2);


        tablica = new int[]{4, 2, 2, 1, 5, 29, 3, 8};
        System.out.println(tablica);
        System.out.println(lista);
    }
}
