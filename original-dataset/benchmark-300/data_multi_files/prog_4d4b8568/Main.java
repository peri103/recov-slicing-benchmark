import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize the QueueManager
        QueueManager queueManager = new QueueManager();

        // Add some unrelated code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        System.out.println("Numbers list: " + numbers);

        // Perform the write operation
        queueManager.addElement(2000); // 2000 milliseconds delay

        // Add more unrelated code
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        System.out.println("Strings list: " + strings);

        // Perform some intermediate operations
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: " + sum);

        // Perform the read operation
        /* read */ DelayedElement element = queueManager.takeElement();
        System.out.println("Element taken: " + element);

        // Add more unrelated code
        strings.forEach(System.out::println);
    }
}