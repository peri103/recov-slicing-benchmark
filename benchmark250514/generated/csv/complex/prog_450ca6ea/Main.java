import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to hold CSV data
            StringWriter writer = new StringWriter();

            // Create a CSVFormat instance and write a header
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeader("Name", "Age", "Country");

            // Use CSVPrinter to write some data
            try (CSVPrinter printer = new CSVPrinter(writer, format)) {
                printer.printRecord("Alice", "30", "USA");
                printer.printRecord("Bob", "25", "UK");
                printer.printRecord("Charlie", "35", "Canada");
            }

            // Read the generated CSV data
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader("Name", "Age", "Country")
                    .withFirstRecordAsHeader()
                    .parse(reader);

            // Introduce additional complexity with unrelated operations
            ArrayList<HashMap<String, String>> recordList = new ArrayList<>();
            for (CSVRecord record : records) {
                HashMap<String, String> recordMap = new HashMap<>();
                recordMap.put("Name", record.get("Name"));
                recordMap.put("Age", record.get("Age"));
                recordMap.put("Country", record.get("Country"));
                recordList.add(recordMap);
            }

            // Perform operations on the list of records
            for (HashMap<String, String> map : recordList) {
                System.out.println("Processing record: " + map);
            }

            // Re-parse the CSV data to access the first record
            reader = new StringReader(csvData);
            records = CSVFormat.DEFAULT
                    .withHeader("Name", "Age", "Country")
                    .withFirstRecordAsHeader()
                    .parse(reader);

            // Access the first record and check if a column is set
            CSVRecord firstRecord = records.iterator().next();
            /* read */ boolean isSet = firstRecord.isSet("Age");
            System.out.println("Is 'Age' column set in the first record? " + isSet);

            // Perform additional unrelated operations
            ArrayList<String> countries = new ArrayList<>();
            for (HashMap<String, String> map : recordList) {
                countries.add(map.get("Country"));
            }
            System.out.println("List of countries: " + countries);

            // Calculate the average age from the records
            int totalAge = 0;
            int count = 0;
            for (HashMap<String, String> map : recordList) {
                totalAge += Integer.parseInt(map.get("Age"));
                count++;
            }
            double averageAge = (double) totalAge / count;
            System.out.println("Average age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}