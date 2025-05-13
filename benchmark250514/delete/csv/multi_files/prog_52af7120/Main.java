import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name, Age, City\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";

        CSVProcessor csvProcessor = new CSVProcessor();
        csvProcessor.parseCSV(csvData);

        CSVReader csvReader = new CSVReader(csvProcessor);
        
        // Simulate reading a CSV record (in practice, you would get this from the CSVParser)
        CSVRecord sampleRecord = new CSVRecord(null, new String[]{"John Doe", "30", "New York"}, null, 0, null);
        csvReader.checkColumnSet(sampleRecord);

        csvReader.printData();

        // Additional unrelated complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of squares: " + sum);

        HashMap<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("John Doe", 30);
        nameToAge.put("Jane Smith", 25);

        for (String name : nameToAge.keySet()) {
            System.out.println(name + " is " + nameToAge.get(name) + " years old.");
        }
    }
}