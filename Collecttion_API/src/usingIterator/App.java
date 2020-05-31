package usingIterator;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        animals.add("Fox");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rabbit");

        Iterator<String> it = animals.iterator();
        while (it.hasNext()) {
        
            String value = it.next();
            System.out.println(value);
            if(value.equals("Cat")){
                it.remove();
            } 
        }
        System.out.println();

        //////////// MOrdern Iterator --Before Java-5 //////////////////
        for (String names : animals) {
            System.out.println(names);
        }
    }
}