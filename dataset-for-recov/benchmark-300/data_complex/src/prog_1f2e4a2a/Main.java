import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        try {
            BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
            ArrayList<Integer> list = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();
            
            // Adding elements to the ArrayList and LinkedList
            for (int i = 0; i < 5; i++) {
                list.add(i * 10);
                linkedList.add(i * 20);
            }
            
            // Writing to the BlockingQueue
            /* write */ queue.put(42);
            
            // Processing the ArrayList
            for (Integer num : list) {
                System.out.println("ArrayList value: " + num);
            }
            
            // Processing the LinkedList
            for (Integer num : linkedList) {
                System.out.println("LinkedList value: " + num);
            }
            
            // Reading from the BlockingQueue
            /* read */ int value = queue.take();
            System.out.println("Value from BlockingQueue: " + value);
            
            // Adding more elements to the ArrayList
            for (int i = 5; i < 10; i++) {
                list.add(i * 10);
            }
            
            // Printing the updated ArrayList
            for (Integer num : list) {
                System.out.println("Updated ArrayList value: " + num);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}