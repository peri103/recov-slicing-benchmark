import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initial CSV data
        String csvData = "name,age\nJohn,30\nJane,25";

        // Additional data structures
        ArrayList<String> namesList = new ArrayList<>();
        HashMap<String, Integer> ageMap = new HashMap<>();

        try {
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Process each CSV record
            for (CSVRecord record : parser) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                namesList.add(name);
                ageMap.put(name, age);
            }

            // Simulate some complex operations
            int sumOfAges = 0;
            for (String name : namesList) {
                sumOfAges += ageMap.get(name);
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Additional logic
            String sampleName = "John";
            if (namesList.contains(sampleName)) {
                System.out.println(sampleName + " is in the list.");
            }

            // More unrelated operations
            for (String name : namesList) {
                System.out.println("Processing name: " + name);
            }

            // Check if a specific header is mapped
            CSVRecord firstRecord = parser.getRecords().get(0);
            /* read */
            boolean isMapped = firstRecord.isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}