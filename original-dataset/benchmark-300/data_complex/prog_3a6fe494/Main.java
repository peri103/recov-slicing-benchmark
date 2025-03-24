import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        
        // Adding elements to the LinkedList
        linkedList.add("Hello");
        linkedList.add("World");
        
        // Writing to the ArrayList
        /* write */ list.add(42);
        
        // Processing the LinkedList
        for (String str : linkedList) {
            System.out.println(str);
        }
        
        // Adding more elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        // Reading from the ArrayList
        /* read */ int value = list.get(0);
        System.out.println("The value read from the list is: " + value);
        
        // Printing all elements in the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}