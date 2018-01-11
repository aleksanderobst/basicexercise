public class Tablice {
    public static void main(String[] args) {
        int[] integers = new int[]{1, 3, 5, 2, 5, 6, 7, 4, 9, 7};
        int sum = 0;
        int sum2 = 0;
        int n=0;
        int result=0;

        System.out.println("a.wszystkie\tcyfry");
        for (int i=0;i <=9;i++){
            System.out.print(integers[i]+" ");

        }
        System.out.println();

        System.out.println("b.6\tpierwszych");
        for (int i=0;i <=9;i++){
            System.out.print(integers[i]+" ");

            if (i==5){
                break;
            }
        }
        System.out.println();

        System.out.println("6\tostatnich\tc");
        for (int i = integers.length-6; i <= integers.length - 1; i++){
            System.out.print(integers[i]+" ");
        }
        System.out.println();


        System.out.println("wszystkie\tparzyste\tcyfry");
        for (int i=0;i <=9;i++){
            if (integers[i]%2 ==0){
            System.out.print(integers[i]+" ");}
        }



        System.out.println();
        System.out.println("wszystkie\tcyfry\tna\tnieparzystych\tindeksach");
        for (int i=0;i <=9;i++){
            if (i%2 == 1) {
                System.out.print(integers[i] + " ");
            }
        }
        System.out.println();
        System.out.println("wszystkie\tcyfry\tod tyl");
        for (int i=9;i >=0;i--){
            System.out.print(integers[i]+" ");
        }
        System.out.println();
        System.out.println("wszystkie\tcyfry\toprócz\t5");
        for (int i=0;i <=9;i++){
            if (integers[i]==5) {
                continue;
                            }
            System.out.print(integers[i] + " ");
        }
        System.out.println();
        System.out.println("wszystkie\tcyfry\tdo\tcyfry\t7 włacznie");
        for (int i=0;i <=9;i++){
            if (integers[i]==4){
                break;
            }
            System.out.print(integers[i]+" ");
        }
        System.out.println();
        System.out.println("wszystkie\tcyfry\tpodzielne\tprzez 3");
        for (int i=0;i <=9;i++) {
            if (integers[i] % 3 == 0) {
                System.out.print(integers[i] + " ");
            }
        }
        System.out.println();
        System.out.println("sumę\twszystkich");
        for (int i=0;i <=9;i++){

            sum += integers[i];
        }
        System.out.print(sum);
        System.out.println();
        System.out.println("sumę\tcyfr\twiększych\tlub\trowne 4");
        for (int i=0;i <=9;i++){
            if (integers[i]>=4) {
                sum2 += integers[i];
            }
        }
        System.out.print(sum2);
        System.out.println();
        System.out.println("najmniejszą\ti\tnajwiększą\tliczbe");





        result = integers[0];
        for (int i=1; i<10; i++) {
            if (result > integers[i]) {
                result = integers[i];
            }
        }
//podaj wynik
        System.out.println("Najmniejszy element w tablicy to " + result);

//szukaj elementu maksymalnego
        result = 8;
        for (int i=1; i<10; i++) {
            if (result < integers[i]) {
                result = integers[i];
            }
        }
//podaj wynik
        System.out.println("Najwiekszy element w tablicy to " + result);





    }
}
