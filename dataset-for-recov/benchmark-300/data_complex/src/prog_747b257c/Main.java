import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        arrayList.add("Hello");
        arrayList.add("World");
        
        // Adding elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        
        // Performing some operations
        for (String str : arrayList) {
            System.out.println(str);
        }
        
        /* write */ linkedList.add(30);
        
        // More operations
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element at index " + i + ": " + linkedList.get(i));
        }
        
        // Adding more elements to the ArrayList
        arrayList.add("Java");
        arrayList.add("Programming");
        
        // Performing some operations
        for (String str : arrayList) {
            System.out.println(str);
        }
        
        /* read */ int value = linkedList.get(2);
        System.out.println("Value read from LinkedList: " + value);
        
        // Final operations
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("ArrayList element at index " + i + ": " + arrayList.get(i));
        }
    }
}