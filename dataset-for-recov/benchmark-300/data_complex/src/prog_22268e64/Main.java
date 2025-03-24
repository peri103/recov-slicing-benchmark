import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<String> stringList = new ArrayList<>();
        
        // Adding some elements to the ArrayList
        stringList.add("Hello");
        stringList.add("World");
        
        // Adding elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        
        /* write */ list.addFirst(1);
        
        // Iterating through the ArrayList and printing elements
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Performing some operations on the LinkedList
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of elements in LinkedList: " + sum);
        
        /* read */ int value = list.getFirst();
        System.out.println("First element in LinkedList: " + value);
        
        // Adding more elements to the LinkedList
        list.addLast(40);
        list.addLast(50);
        
        // Printing the final state of the LinkedList
        System.out.println("Final LinkedList: " + list);
    }
}