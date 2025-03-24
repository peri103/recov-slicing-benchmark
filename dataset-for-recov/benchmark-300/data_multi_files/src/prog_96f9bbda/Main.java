import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Transfer elements from list to linkedList
        for (Integer num : list) {
            linkedList.add(num);
        }

        // Print elements from linkedList
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        // Process data
        processor.processData();

        // Consume data
        consumer.consumeData();

        // Add more elements to the list
        for (int i = 5; i < 10; i++) {
            list.add(i * 10);
        }

        // Print elements from list
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}