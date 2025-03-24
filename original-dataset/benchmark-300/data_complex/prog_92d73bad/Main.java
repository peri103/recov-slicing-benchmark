import java.util.Vector;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector();
        Random random = new Random();
        
        // Generate a random number and add it to the vector
        int randomNumber = random.nextInt(100);
        vector.add(randomNumber);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Add another random number to the vector
        int anotherRandomNumber = random.nextInt(100);
        vector.add(anotherRandomNumber);
        
        // Perform more unrelated operations
        String message = "Hello, World!";
        System.out.println(message);
        
        // Read the first value added to the vector
        /* read */ int value = (Integer) vector.get(0);
        System.out.println("First value in vector: " + value);
        
        // Add some more elements to the vector
        for (int i = 0; i < 5; i++) {
            vector.add(i * 10);
        }
        
        // Print all elements in the vector
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Element " + i + ": " + vector.get(i));
        }
    }
}