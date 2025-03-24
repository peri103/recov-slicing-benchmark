import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Initialize list with random values
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        // Add some elements to the deque
        for (int i = 0; i < 5; i++) {
            deque.addLast(random.nextInt(100));
        }

        /* write */ deque.addLast(42);

        // Perform some operations on the list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                deque.addLast(list.get(i));
            }
        }

        // Remove some elements from the deque
        for (int i = 0; i < 3; i++) {
            if (!deque.isEmpty()) {
                deque.removeFirst();
            }
        }

        /* read */ int value = deque.getLast();
        System.out.println("The last value in the deque is: " + value);

        // Additional operations to make the program more complex
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        for (String str : stringList) {
            System.out.println(str);
        }

        // More operations with the deque
        while (!deque.isEmpty()) {
            System.out.println("Removed from deque: " + deque.removeFirst());
        }
    }
}