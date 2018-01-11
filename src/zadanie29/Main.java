package zadanie29;

import java.util.Scanner;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Map.Entry;
        import java.util.Set;
        import java.util.Scanner;
public class Main {



    public static void main(String[] args)
    {

        String s;
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        System.out.println("Podaj napis ");
        s = odczyt.nextLine();

        System.out.println(s);
        int counter = 0;
        String a = s.substring(s.length() - 1);
        char c = a.charAt(0);

        for( int i=0; i<s.length(); i++ ) {
            if( s.charAt(i) == c ) {
                counter++;
            }

        }
        System.out.print("Ostatni znak występuje "+counter+" razy.");

//        countOcccurence(s);
        System.out.println();
        System.out.println(" ostatni znak:  " +
                s.substring(s.length() - 1));

    }

//    private static void countOcccurence(String input)
//    {
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        String[] tokens =input.split("");
//        for (int i = 0; i < tokens.length; i++)
//        {
//            String string = tokens[i];
//            if(map.containsKey(string))
//            {
//                int value=map.get(string);
//                value++;
//                map.put(string, value);
//            }
//            else
//            {
//                map.put(string, 1);
//            }
//        }
//        Set<Entry<String,Integer>> entryset = map.entrySet();
//        for(Entry<String,Integer> entry: entryset)
//        {
//            System.out.print(entry.getKey()+entry.getValue());
//        }



}


