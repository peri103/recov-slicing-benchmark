import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize ArArchiveEntry and perform write operation
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        /* write */ entry.setUserId(12345);

        // Create an ArrayList and populate it with some numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        // Perform some calculations with the numbers
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Perform read operation from ArArchiveEntry
        /* read */ int userId = entry.getUserId();
        System.out.println("User ID from ArArchiveEntry: " + userId);

        // Additional operations with ArrayList
        int maxNumber = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Maximum number: " + maxNumber);

        // Create another ArArchiveEntry and perform similar operations
        ArArchiveEntry anotherEntry = new ArArchiveEntry("another_example.txt", 2000);
        anotherEntry.setUserId(67890);
        int anotherUserId = anotherEntry.getUserId();
        System.out.println("Another User ID: " + anotherUserId);
    }
}