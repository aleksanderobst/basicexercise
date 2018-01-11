package gdynia.watki;

public class Watek {
    private static Integer counter = 0;
    public static void main(String[] args) {


        Thread thread1 = new Thread () {



            public void run () {
                synchronized (counter) {

                }
            }
        };
        Thread thread2 = new Thread () {
            public void run () {

               // ... your code here

           
            }
        };



        thread1.start();
        thread2.start();

      //  public synchronized void increment(){}
        increment2();
        increment3();
    }
    public static synchronized void increment2() {
        counter++;
        System.out.println("counter: " + counter);

    }
    public static synchronized void increment3() {
        counter++;
        System.out.println("counter: " + counter);

    }
    }

