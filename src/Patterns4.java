public class Patterns4 {
    public static void main(String[] args) {

        String pattern = "#";
        int noOfTimes =7;
        System.out.println("Part a)");
        for (int i =0; i < 10; i++)
        {
            for (int j=0; j < i+1; j++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("Part b)");
        for(int k = 10; k > 0; k--){
            for(int l=0; l < k-1; l++){
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("Part c)");
        for(int k = 10; k > 0; k--){
            for(int l=0; l < k-1; l++){
               System.out.print("  ");
            }
            for(int n=10; n > k-1; n--){
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println("Part d)");
        for(int k = 0; k < 10; k++){
            for(int l=1; l < k+1; l++){
                System.out.print("  ");
            }
            for(int n=10; n > k; n--){
                System.out.print("# ");
            }
            System.out.println();
        }
        for(int i=1; i<=noOfTimes; i++) {

            System.out.println();

            if(i==1 || i==noOfTimes) {

                for(int j=1; j<=noOfTimes; j++){

                    System.out.print(pattern+" ");

                }
            }
            else {

                for(int k=1; k<=noOfTimes;k++) {

                    if(k==1 || k == noOfTimes) {

                        System.out.print(pattern + " ");

                    }
                    else {

                        System.out.print("  ");

                    }
                }
            }
        }
        System.out.println();
        for(int i=1; i<=noOfTimes; i++) {

            System.out.println();

            if(i==1 || i==noOfTimes) {

                for(int j=1; j<=noOfTimes; j++){

                    System.out.print(pattern+" ");

                }
            }
            else {

                for(int k=1; k<=noOfTimes;k++) {

                    if(k==1 || k == noOfTimes) {

                        System.out.print(pattern + " ");

                    }



                    else {

                        System.out.print(i+" ");

                    }
                }


            }
        }
        System.out.println();
    }
    }


