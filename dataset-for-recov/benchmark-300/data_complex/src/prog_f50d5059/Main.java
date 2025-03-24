import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet set = new CopyOnWriteArraySet();
        ArrayList list = new ArrayList();
        LinkedList linkedList = new LinkedList();

        // Adding elements to the ArrayList and LinkedList
        list.add("element1");
        linkedList.add("element2");

        /* write */ set.add("testValue");

        // Adding elements from ArrayList and LinkedList to the CopyOnWriteArraySet
        set.addAll(list);
        set.addAll(linkedList);

        // Iterating over the CopyOnWriteArraySet and printing its elements
        for (Object obj : set) {
            System.out.println(obj);
        }

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* read */ boolean containsValue = set.contains("testValue");
        System.out.println("Does the set contain 'testValue'? " + containsValue);

        // More unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}