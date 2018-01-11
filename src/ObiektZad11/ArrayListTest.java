package ObiektZad11;

import java.util.ArrayList;

        import java.util.*;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        // fill the staff array list with three User objects
        ArrayList<User> staff = new ArrayList<>();

        staff.add(new User("Carl Cracker","wisienka"));
        staff.add(new User("Harry Hacker", "alabaster"));
        staff.add(new User("Tony Tester", "lubiegrilla"));
        staff.add(new User("Jolly Beam", "disco70"));
        // raise everyone's salary by 5%


        // print out information about all User objects
        for (User e : staff)
            System.out.println(" name=" + e.getName()  + " , passphrase=" +e.getPassword())
                    ;
    }
}