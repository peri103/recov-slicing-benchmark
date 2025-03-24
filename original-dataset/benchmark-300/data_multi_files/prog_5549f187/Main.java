import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Initialize some data
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Perform some operations on the list and linkedList
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        // Create and start the data processor
        DataProcessor processor = new DataProcessor(queue);
        processor.processData();

        // Perform more operations
        for (int i = 0; i < linkedList.size(); i++) {
            list.add(linkedList.get(i));
        }

        // Create and start the data consumer
        DataConsumer consumer = new DataConsumer(queue);
        consumer.consumeData();

        // Print the final state of the list
        System.out.println("Final list contents:");
        for (int i : list) {
            System.out.println(i);
        }
    }
}