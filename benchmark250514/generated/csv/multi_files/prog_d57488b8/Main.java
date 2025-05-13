import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a CSVHandler instance and set delimiter
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.setDelimiter(';');

        // Create a sample CSV string
        String csvData = "name;age;city\nJohn;30;New York\nJane;25;Los Angeles";

        // Parse the CSV data
        CSVProcessor csvProcessor = new CSVProcessor(csvHandler.parseCSV(csvData));
        csvProcessor.printRecords();

        // Read the first record and convert it to a string
        String recordString = csvProcessor.getFirstRecordAsString();
        if (recordString != null) {
            System.out.println(recordString);
        }

        // Additional unrelated code to make the program more complex
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 30);
        ageMap.put("Jane", 25);

        for (String name : ageMap.keySet()) {
            System.out.println("Age of " + name + " is " + ageMap.get(name));
        }

        // Further unrelated operations to increase complexity
        int sumOfAges = ageMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ages: " + sumOfAges);
    }
}