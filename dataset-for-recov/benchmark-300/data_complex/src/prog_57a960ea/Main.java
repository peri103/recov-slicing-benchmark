import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding some numbers to the ArrayList
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Performing some operations on the ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Writing to the LinkedList
        /* write */ list.addLast("Hello, World!");
        
        // Creating another LinkedList and adding elements
        LinkedList<Integer> anotherList = new LinkedList<>();
        anotherList.add(100);
        anotherList.add(200);
        anotherList.add(300);
        
        // Reading from the LinkedList
        /* read */ String value = list.getLast();
        System.out.println("Value from LinkedList: " + value);
        
        // Printing elements from the second LinkedList
        for (int num : anotherList) {
            System.out.println("Another List Element: " + num);
        }
    }
}