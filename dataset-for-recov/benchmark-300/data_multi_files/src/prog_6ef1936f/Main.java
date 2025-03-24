import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Add some random numbers to the list
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        // Print the list
        System.out.println("List of random numbers:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // Add a value to the set
        student.addValueToSet("Hello");

        // Perform some unrelated operations
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // Check if the set contains the written value
        boolean contains = student.checkValueInSet("Hello");
        System.out.println("Set contains 'Hello': " + contains);

        // Add more values to the set
        student.addValueToSet("World");
        student.addValueToSet("Java");

        // Check if the set contains the new values
        System.out.println("Set contains 'World': " + student.checkValueInSet("World"));
        System.out.println("Set contains 'Java': " + student.checkValueInSet("Java"));
    }
}