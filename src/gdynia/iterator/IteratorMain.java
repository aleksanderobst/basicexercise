package gdynia.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        for (String name : names){


        }
        Iterator<String> nemesIterator = names.iterator();

        String name;
//        while(namesIterator.hasNext()){
//            name = nemesIterator.next();
//            System.out.println(name);
//            if(name.sartsWith("a"))
        }
    }

