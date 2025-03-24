import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor();
        StringProcessor stringProcessor = new StringProcessor();
        List<Integer> numbers = new ArrayList<>();

        // Adding some unrelated code
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Writing to the original queue
        Thread writerThread = new Thread(() -> dataProcessor.writeData(42));
        writerThread.start();

        // Using the StringProcessor for a different purpose
        Thread stringWriterThread = new Thread(() -> stringProcessor.writeString("Hello, World!"));
        stringWriterThread.start();

        // Reading from the original queue
        int value = dataProcessor.readData();
        System.out.println("Value from queue: " + value);

        // Reading from the string queue
        String message = stringProcessor.readString();
        System.out.println("Message from stringQueue: " + message);

        // More unrelated code
        System.out.println("Numbers list:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}