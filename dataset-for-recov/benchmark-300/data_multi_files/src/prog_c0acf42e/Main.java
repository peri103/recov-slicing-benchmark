import java.util.concurrent.DelayQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        DelayedElement element = new DelayedElement(1000); // 1 second delay
        queueManager.addElement(element);

        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println("Generated numbers: " + numbers);

        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        sortedNumbers.sort(Integer::compareTo);

        System.out.println("Sorted numbers: " + sortedNumbers);

        int sum = sortedNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of sorted numbers: " + sum);

        /* read */ DelayedElement takenElement = queueManager.takeElement();
        System.out.println("Element taken from queue: " + takenElement);

        // More additional code
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");
        words.stream()
             .filter(word -> word.startsWith("b"))
             .forEach(System.out::println);
    }
}