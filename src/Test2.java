public class Test2 {
    public static void main(String[] args) {




        int age = 25;
        int result;
        int result2; // reszta z dzielenia
        String name = "Jan";
        String surname = "Kowalski";// poniżej umieśćcie kod, który realizuje powyższe założenia
        //
        System.out.println("Nazywam się " + name + " " + surname + ".");
        System.out.println("Mam " + age + " lat" + ".");
        System.out.println("Moje lata w dziesięcioleciach:");

      //  int i = 1;
       // for (;i <= 10;) {
       //     i++;
          //  System.out.println(" i = " + i);
       // }
result = age/10;
result2 = age%10;


        for (int i = 1; i <= result; i++ )

        {if (age % 10 == 5)

        {
            System.out.println("**********");


        }

        else {System.out.println("**********");}}

        for (int i = 1; i <= result2; i++ )

        {if (age % 10 == 5)

        {
            System.out.printf("*");


        }

        else {System.out.printf("*");}}








        }
}