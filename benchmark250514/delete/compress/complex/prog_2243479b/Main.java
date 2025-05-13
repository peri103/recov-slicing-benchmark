import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        byte[] extraData = {0x01, 0x02, 0x03};
        
        // Unrelated code: ArrayList manipulation
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Unrelated code: Calculate sum of numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        /* write */ gzipParameters.setExtra(extraData);
        
        // Unrelated code: Reverse the numbers list
        ArrayList<Integer> reversedNumbers = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedNumbers.add(numbers.get(i));
        }
        
        // Print reversed numbers
        System.out.println("Reversed numbers:");
        for (int number : reversedNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        /* read */ byte[] readExtraData = gzipParameters.getExtra();
        
        // Print the extra data from GzipParameters
        System.out.print("Extra data: ");
        for (byte b : readExtraData) {
            System.out.printf("0x%02X ", b);
        }
        System.out.println();
        
        // Unrelated code: Find max value in numbers list
        int maxValue = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("Max value: " + maxValue);
    }
}