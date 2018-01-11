package testKsiazkaJava9;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Data {
    public static void main( String[] args ) {


    GregorianCalendar d = new GregorianCalendar();
    int today = d.get(Calendar.DAY_OF_MONTH);
    int month = d.get(Calendar.MONTH);
    int year = d.get(Calendar.YEAR);
        System.out.print(today+"/");
        System.out.print(month+"/");
        System.out.print(year+" ");
}
}
