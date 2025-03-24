import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        DataProcessor dataProcessor = new DataProcessor();

        // Generate some random numbers
        dataProcessor.generateNumbers(5);
        List<Integer> numbers = dataProcessor.getNumbers();
        System.out.println("Generated numbers: " + numbers);

        try {
            // Write the first number from the list to the queue
            queueManager.addToQueue(numbers.get(0));

            // Perform some operations with the list
            for (int i = 1; i < numbers.size(); i++) {
                queueManager.addToQueue(numbers.get(i));
            }

            // Read the first number from the queue
            /* read */ int value = queueManager.takeFromQueue();
            System.out.println("Value read from queue: " + value);

            // Generate some more numbers
            dataProcessor.generateNumbers(3);
            System.out.println("Updated numbers: " + dataProcessor.getNumbers());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}