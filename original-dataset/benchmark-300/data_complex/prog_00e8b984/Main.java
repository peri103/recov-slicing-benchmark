import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding some numbers to the ArrayList
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 5);
        }
        
        // Adding the first number from the ArrayList to the LinkedList
        /* write */ list.addFirst(numbers.get(0));
        
        // Performing some operations on the ArrayList
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                list.addLast(numbers.get(i));
            }
        }
        
        // Reading the first element from the LinkedList
        /* read */ Object value = list.getFirst();
        System.out.println("First element in LinkedList: " + value);
        
        // Printing all elements in the LinkedList
        System.out.println("All elements in LinkedList:");
        for (Object element : list) {
            System.out.println(element);
        }
        
        // Adding some more complex operations
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        
        for (String str : strings) {
            System.out.println(str.toUpperCase());
        }
    }
}