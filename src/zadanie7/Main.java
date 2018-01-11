package zadanie7;
import java.util.Scanner;


public class Main {


public static void main(String args[]){
             Scanner sc=new Scanner(System.in);

              System.out.println("Podaj temperaturę w stopniach Celcjusza");
              double rollno=sc.nextDouble();
              rollno = (rollno*1.8) + 32;
               System.out.println("Temp Fahrenheit:"+rollno);
               sc.close();
             }
}

