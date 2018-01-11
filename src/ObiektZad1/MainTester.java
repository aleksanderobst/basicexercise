package ObiektZad1;

public class MainTester {

        public static void main(String[] args) {


            Osoba main = new Osoba("Basia",24);
            Osoba main2 = new Osoba("Dominika",34);
            Osoba main3 = new Osoba("Weronika",39);
            System.out.println(main);
            System.out.println(main2.toString());
            System.out.println(main3.toString());
            main.printNameAge();
            main2.printNameAge();
            main3.printNameAge();

            System.out.println(main.getAge());
            main.setAge(56);
            System.out.print(main.getAge()+", ");





        }
    }

