package ObiektZad11;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2b {


    public static void negativeBool() {
        //tworzymy tablicę

        List<Boolean> lista2 = new ArrayList<Boolean>();
        lista2.add(true);
        lista2.add(false);
        lista2.add(true);
        lista2.add(false);

        System.out.println("Odwrotna wartość boolean");
        int i;
        double sum = 0;
        for (i = 0; i < lista2.size(); i++)
            if (lista2.get(i) == true) {
                lista2.set(i, false);
            } else if (lista2.get(i) == false) {
                lista2.set(i, true);

            }
        for( i =0; i<lista2.size();i++)

        {
            System.out.println(lista2.get(i));
        }

    }

    public static void  AND() {

        List<Boolean> lista2 = new ArrayList<Boolean>();
        lista2.add(true);
        lista2.add(true);
        lista2.add(true);
        lista2.add(false);
        lista2.add(false);
        System.out.println("koniunkcja - AND");
        for(int i =0; i<((lista2.size())-1);i++)

        {


           if(lista2.get(i)&&lista2.get(i+1))

    {
        System.out.println("prawda");
    }

           else

    {
        System.out.println("fałsz");
    }

}
    }

    public static void OR() {

        List<Boolean> lista2 = new ArrayList<Boolean>();
        lista2.add(true);
        lista2.add(true);
        lista2.add(true);
        lista2.add(false);
        lista2.add(false);
        System.out.println("alternatywa - OR");
        for(int i =0; i<((lista2.size())-1);i++)

        {


            if(lista2.get(i)||lista2.get(i+1))

            {
                System.out.println("prawda");
            }

            else

            {
                System.out.println("fałsz");
            }

        }


    }
    }

