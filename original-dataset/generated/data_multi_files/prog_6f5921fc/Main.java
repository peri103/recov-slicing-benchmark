public class Main {
    public static void main(String[] args) {
        DequeOperations dequeOps = new DequeOperations();
        DataProcessor dataProcessor = new DataProcessor();

        // Add elements to queue and list in DataProcessor
        dataProcessor.addToQueue("Hello");
        dataProcessor.addToQueue("World");
        dataProcessor.addToList("First");
        dataProcessor.addToList("Second");

        // Simulate processing
        dataProcessor.processQueue();
        dataProcessor.processList();

        // Add and process elements in DequeOperations
        dequeOps.addToDeque(42);
        dequeOps.addToDeque(10);
        dequeOps.addToDeque(20);

        // Simulate processing delay
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Read from the deque
        try {
            /* read */ 
            int value = dequeOps.takeFromDeque();
            System.out.println("Deque Value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}