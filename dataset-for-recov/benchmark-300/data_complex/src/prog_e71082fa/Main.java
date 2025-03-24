import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        // Adding elements to the LinkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        /* write */ list.addLast(100);
        
        // Printing elements from the ArrayList
        for (String str : stringList) {
            System.out.println(str);
        }
        
        // Performing some operations on the LinkedList
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of LinkedList elements: " + sum);
        
        /* read */ int value = list.getLast();
        System.out.println("Last element in LinkedList: " + value);
        
        // Adding more elements to the LinkedList
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }
        
        // Printing all elements in the LinkedList
        for (int num : list) {
            System.out.println(num);
        }
    }
}