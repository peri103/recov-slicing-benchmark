import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");

        // Unrelated code to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Another unrelated operation
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        /* write */ zipEntry.setExternalAttributes(12345L);

        // More unrelated operations
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number: " + max);

        // Some logical checks
        if (sum > 50) {
            System.out.println("Sum is greater than 50");
        } else {
            System.out.println("Sum is 50 or less");
        }

        /* read */ long externalAttributes = zipEntry.getExternalAttributes();
        System.out.println("External Attributes: " + externalAttributes);

        // Final unrelated operation
        numbers.clear();
        System.out.println("Numbers list cleared, size: " + numbers.size());
    }
}