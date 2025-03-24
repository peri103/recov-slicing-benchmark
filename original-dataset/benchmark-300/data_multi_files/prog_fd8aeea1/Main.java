import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        List<Integer> numbers = new ArrayList<>();
        
        // Adding some unrelated operations
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 3);
        }
        
        // Performing the write operation
        student.addValueToQueue(42);
        
        // More unrelated operations
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
        
        // Performing the read operation
        /* read */ int value = student.getValueFromQueue();
        System.out.println("Value read from queue: " + value);
        
        // Additional unrelated code
        List<String> messages = new ArrayList<>();
        messages.add("Hello");
        messages.add("World");
        for (String msg : messages) {
            System.out.println(msg);
        }
    }
}