import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipParameters
        GzipParameters gzipParams = new GzipParameters();
        
        // Initialize an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Populate ArrayList
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Perform operations on ArrayList
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        // Print sum of ArrayList elements
        System.out.println("Sum of numbers: " + sum);
        
        // Set flags using GzipParameters
        /* write */ gzipParams.setFlags(5);
        
        // Perform additional calculations
        int product = 1;
        for (int number : numbers) {
            product *= number + 1;
        }
        
        // Print product of modified ArrayList elements
        System.out.println("Product of modified numbers: " + product);
        
        // Retrieve flags from GzipParameters
        /* read */ int flags = gzipParams.getFlags();
        
        // Print retrieved flags
        System.out.println("Retrieved flags: " + flags);
        
        // Further operations
        ArrayList<Integer> squaredNumbers = new ArrayList<>();
        for (int number : numbers) {
            squaredNumbers.add(number * number);
        }
        
        // Print squared numbers
        System.out.println("Squared numbers:");
        for (int squaredNumber : squaredNumbers) {
            System.out.println(squaredNumber);
        }
    }
}