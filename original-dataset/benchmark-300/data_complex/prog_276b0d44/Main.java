import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        for (int i = 0; i < 10; i++) {
            arrayList.add(i * 2);
        }
        
        // Printing elements from the ArrayList
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("ArrayList element at index " + i + ": " + arrayList.get(i));
        }
        
        /* write */ list.addLast(42);
        
        // Adding more elements to the LinkedList
        for (int i = 1; i < 5; i++) {
            list.addLast(i * 10);
        }
        
        // Printing elements from the LinkedList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("LinkedList element at index " + i + ": " + list.get(i));
        }
        
        /* read */ int value = list.getLast();
        System.out.println("Last element in LinkedList: " + value);
        
        // Additional complex logic
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        
        for (String str : stringList) {
            System.out.println("String element: " + str);
        }
        
        // Nested loop for complexity
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Nested loop: i=" + i + ", j=" + j);
            }
        }
    }
}