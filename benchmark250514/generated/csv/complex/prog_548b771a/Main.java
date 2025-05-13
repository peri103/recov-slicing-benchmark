import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withQuote('"');

            // Sample CSV data
            String csvData = "\"name\",\"age\"\n\"John Doe\",\"30\"\n\"Jane Smith\",\"25\"";

            // Parse CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Initialize a list and a map for additional complexity
            ArrayList<String> names = new ArrayList<>();
            HashMap<String, Integer> ageMap = new HashMap<>();

            // Process each CSV record
            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                names.add(name);
                ageMap.put(name, age);
            }

            // Perform some operations on the list and map
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // Read the first record again
            CSVRecord firstRecord = records.iterator().next();
            
            // Print the record using toString method
            /* read */ String recordString = firstRecord.toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}