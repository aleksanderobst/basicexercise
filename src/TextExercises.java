public class TextExercises {
    public static void main(String[] args) {
        int age = 25;
        String name = "Jan";
        String surname = "Kowalski";

        System.out.println("Nazywam się " + name + " " + surname + ".");
        System.out.println("Mam " + age + " lat.");
        System.out.println("Moje lata w dziesięcioleciach:");

        for (int i = 1; i <= age; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}