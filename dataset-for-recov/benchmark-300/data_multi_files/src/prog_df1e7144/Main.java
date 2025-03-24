import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        
        // Unrelated code: Generate and process a list of numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 3);
        }
        System.out.println("Generated numbers: " + numbers);

        List<Integer> multiplesOfThree = new ArrayList<>();
        for (int num : numbers) {
            if (num % 3 == 0) {
                multiplesOfThree.add(num);
            }
        }
        System.out.println("Multiples of three: " + multiplesOfThree);

        // Write to the queue
        queueManager.addElement(3000); // Delay of 3 seconds

        // More unrelated code
        int sum = 0;
        for (int num : multiplesOfThree) {
            sum += num;
        }
        System.out.println("Sum of multiples of three: " + sum);

        // Read from the queue
        DelayedElement element = queueManager.takeElement();
        System.out.println("Element taken from queue: " + element);

        // Additional complex code
        List<String> messages = new ArrayList<>();
        messages.add("Hello");
        messages.add("From");
        messages.add("Java");
        messages.add("Multi-file Program");

        for (String msg : messages) {
            System.out.println(msg);
        }
    }
}