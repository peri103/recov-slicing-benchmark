import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Double> arrayList = new ArrayList<>();

        // Adding elements to the linked list
        for (int i = 0; i < 10; i++) {
            linkedList.add(i * 2);
        }

        // Adding elements to the array list
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 1.5);
        }

        // Perform some operations on the linked list
        int sum = 0;
        for (Integer num : linkedList) {
            sum += num;
        }
        System.out.println("Sum of linked list elements: " + sum);

        // Perform some operations on the array list
        double product = 1.0;
        for (Double num : arrayList) {
            product *= num;
        }
        System.out.println("Product of array list elements: " + product);

        /* write */ set.add("example");

        // More operations on the linked list
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked list after removing first and last elements: " + linkedList);

        // More operations on the array list
        arrayList.add(10.0);
        arrayList.remove(0);
        System.out.println("Array list after adding and removing elements: " + arrayList);

        /* read */ boolean contains = set.contains("example");
        System.out.println("Does the set contain 'example'? " + contains);

        // Final operations on the linked list and array list
        linkedList.clear();
        arrayList.clear();
        System.out.println("Linked list and array list after clearing: " + linkedList + " " + arrayList);
    }
}