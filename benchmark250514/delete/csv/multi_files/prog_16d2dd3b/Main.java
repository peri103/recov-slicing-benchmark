import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "name;age;city\nJohn Doe;30;New York\nJane Smith;25;Los Angeles";
            
            // CSV handling
            CSVHandler csvHandler = new CSVHandler();
            List<CSVRecord> records = csvHandler.parseCSV(csvData);
            
            // Process records
            RecordProcessor recordProcessor = new RecordProcessor(records);
            List<String> names = recordProcessor.extractNames();
            
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }
            
            // Get and print the first record as a string
            String firstRecordString = recordProcessor.getFirstRecordString();
            System.out.println("First record: " + firstRecordString);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Additional unrelated code to increase complexity
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        // Perform some operations on the numbers list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }
    }
}