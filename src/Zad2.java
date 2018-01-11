
    public class Zad2 {
        public static void main(String[] args) {
            int from = 1;
            int to = 10;
            int sum2 = 0;
            long sum = 0;
            long mul = 1;
            int number = 0;
            for (int i = from; i <= to; i++) {
                // można też sum = sum + i;sum += i;
            }
                // można też mul = mul * i;mul *= i;}

            for (int i=0; i<=10; i++){
              sum = sum+i;
                            }

            for (int i=1; i<=10; i++){
                mul = mul*i;

            }
            System.out.println("Suma liczb od " + from + " do " + to + " = " + sum);
            System.out.println("Iloczyn liczb od " + from + " do " + to + " = " + mul);
            System.out.print("a) ");
            sum = 0;

            for (int i=0; i<=10; i++){

                System.out.print(i+" ");
            }
            System.out.println();
            System.out.print("b) ");
            for (int i=0; i<=100; i++){
                if (i==7) {
                    break;
                }
                System.out.print(i+" ");
            }

            System.out.println();
            System.out.print("c) ");
            for (int i=0; i<=10; i++) {
                switch (i) {
                    case 0:

                        continue;
                    case 1:

                        continue;
                    case 2:

                        continue;
                    case 3:

                        continue;

                    default:
                    System.out.print(i + " ");
                }
            }

            System.out.println();
            System.out.print("d) ");
            for (int i=1; i<=10; i++){
                if (i % 2 == 0)

                {
                    System.out.print(i+" ");


                }
            }
            System.out.println();
            System.out.print("e) ");
            for (int i=10; i>=1; i--){

                System.out.print(i+" ");
            }
            System.out.println();
            System.out.print("f) ");
            for (int i=0; i<=10; i++){
                switch (i){
                    case 3:
                        continue;
                    case 7:
                        continue;
                    default:
                        System.out.print(i+" ");
                }

            }

            System.out.println();
            System.out.print("g) ");
            for (int i=1; i<=10; i++){

                if (i % 3 == 0)

                {
                    System.out.print(i+" ");


                }
            }
            System.out.println();
            System.out.print("h) ");

            for (int i=1; i<=4; i++){
                sum = sum+i;

                System.out.print(i);
               if (i == 1){
                    System.out.print("+");
                }
                if (i == 2){
                    System.out.print("+");
                }
                if (i == 3){
                    System.out.print("+");
                }
            }

            System.out.print(" = "+sum);
            System.out.println();
            System.out.print("i) ");
            mul = 1;

            for (int i=1; i<=5; i++){

                mul = mul*i;

                System.out.print(i);
                if (i == 1){
                    System.out.print("*");
                }
                if (i == 2){
                    System.out.print("*");
                }
                if (i == 3){
                    System.out.print("*");
                }
                if (i == 4){
                    System.out.print("*");
                }
            }

            System.out.println(" = "+mul);

        }
}

