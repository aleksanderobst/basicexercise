package testKsiazkaJava9;


    public class Test
    {
        public static void main(String[] args)
        {
            String[] greeting = new String[3];
            greeting[0] = "Witaj, czytelniku!";
            greeting[1] = "Pozdrowienia od Caya Horstmanna";
            greeting[2] = "i Gary'ego Cornella";
            for (String g : greeting)
                System.out.println(g);
        }
    }