import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Gender\nJohn,30,Male\nJane,25,Female";

            // Create a CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            ArrayList<CSVRecord> records = new ArrayList<>(parser.getRecords());

            // Process each record and store information in a HashMap
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Perform calculations using the stored data
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);

            // Retrieve record and check if a specific header is mapped
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("Name");
            System.out.println("Is 'Name' mapped in first record: " + isMapped);

            // Additional logic to demonstrate complexity
            for (CSVRecord record : records) {
                String gender = record.get("Gender");
                System.out.println(record.get("Name") + " is " + gender);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}