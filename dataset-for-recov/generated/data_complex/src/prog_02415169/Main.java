import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        LinkedList<String> stringList = new LinkedList<>();
        List<Double> doubleList = new LinkedList<>();

        // Adding some elements to the stringList
        stringList.add("Hello");
        stringList.add("World");

        // Adding some elements to the doubleList
        doubleList.add(3.14);
        doubleList.add(2.718);

        // Manipulate stringList
        for (String str : stringList) {
            System.out.println("StringList item: " + str);
        }

        // Manipulate doubleList
        double sum = 0;
        for (Double d : doubleList) {
            sum += d;
        }
        System.out.println("Sum of doubleList: " + sum);

        // Original write operation
        /* write */ deque.addLast(42);

        // Adding more elements to deque
        deque.addLast(100);
        deque.addLast(200);

        // Perform operations on deque
        try {
            int firstValue = deque.takeFirst();
            System.out.println("First value taken: " + firstValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More operations on doubleList
        doubleList.add(1.414);
        doubleList.add(1.732);
        double average = sum / doubleList.size();
        System.out.println("Average of doubleList: " + average);

        // Original read operation
        try {
            /* read */ int value = deque.takeLast();
            System.out.println("Last value taken: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Add more elements and print them
        deque.addLast(300);
        deque.addLast(400);
        try {
            while (!deque.isEmpty()) {
                int dequeValue = deque.takeFirst();
                System.out.println("Deque value: " + dequeValue);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}