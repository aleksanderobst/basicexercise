package Dodatkowe2;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Main{
    private int amount;

    public Main() {
        this.amount = 0;}

    public Main(int amount, int deposit, int withdraw) {
        this.amount = this.amount;

    }
        public static void main(String[] args){
           int j = 0;



            String imie; //w nim zapiszemy swoje imie
            Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
            String tab[] = new String[3];
            System.out.println("Podaj trzy kolejne wyrazy zdania ");
            tab[0] = odczyt.nextLine();
            tab[1] = odczyt.nextLine();
            tab[2] = odczyt.nextLine();

            for (int i =0; i <3; i++){
                System.out.printf(" "+tab[i]);

            }
            int sum = 0;
            for (int i =0; i <3; i++) {
                String s = tab[i];
                countOcccurence(s);

                String Str1 = new String(s);

                sum = sum + Str1.length();

            }
            System.out.println();
            System.out.println("Srednia długość słowa wynosi "+sum/3);
        }


        private static void countOcccurence(String input)
        {
            System.out.println();
            Map<String, Integer> map = new HashMap<String, Integer>();
            String[] tokens =input.split("");
           int i=0;
                String string = tokens[i];
                if(map.containsKey(string))
                {
                    int value=map.get(string);
                    value++;
                    map.put(string, value);
                }
                else
                {
                    map.put(string, 1);
                }

            Set<Map.Entry<String,Integer>> entryset = map.entrySet();
            for(Map.Entry<String,Integer> entry: entryset)
            {
                System.out.print(tokens.length);
            }
            anotherMethod(tokens.length);

        }
    public static void anotherMethod(int param){
        int sum = param;

      //  System.out.println(" " + sum);
    }

    }

