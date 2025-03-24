import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<String> stringList = new ArrayList<>();
        
        // Adding some unrelated elements to the stringList
        stringList.add("Hello");
        stringList.add("World");
        
        // Performing some operations on the stringList
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Writing to the LinkedList
        /* write */ list.addLast(42);
        
        // Adding more elements to the list
        list.addFirst(10);
        list.addLast(100);
        
        // Performing some operations on the list
        for (Integer num : list) {
            System.out.println(num);
        }
        
        // Reading from the LinkedList
        /* read */ int value = list.getLast();
        System.out.println("The last value in the list is: " + value);
        
        // Adding more unrelated code
        LinkedList<Double> doubleList = new LinkedList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);
        
        for (Double d : doubleList) {
            System.out.println(d);
        }
    }
}