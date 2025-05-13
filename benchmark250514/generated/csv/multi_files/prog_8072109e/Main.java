import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CSVProcessor csvProcessor = new CSVProcessor();
            csvProcessor.writeData(Arrays.asList("value1", "value2", "value3"));

            // Additional complex operations
            csvProcessor.writeData(Arrays.asList("extra1", "extra2", "extra3"));

            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Read CSV data
            CSVReader csvReader = new CSVReader();
            String firstRecord = csvReader.readFirstRecord(csvProcessor.getCSVOutput());

            // Print the first CSV record
            System.out.println("First CSV Record: " + firstRecord);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}