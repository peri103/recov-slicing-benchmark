import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setUncompressedSize(1024L);

        // Additional code to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 100);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number: " + max);

        // Now read the value set by the write method
        /* read */ long uncompressedSize = gzipParameters.getUncompressedSize();
        System.out.println("Uncompressed Size: " + uncompressedSize);

        // Additional operations on numbers
        ArrayList<Integer> doubledNumbers = new ArrayList<>();
        for (int num : numbers) {
            doubledNumbers.add(num * 2);
        }

        for (int doubledNum : doubledNumbers) {
            System.out.println("Doubled number: " + doubledNum);
        }
    }
}