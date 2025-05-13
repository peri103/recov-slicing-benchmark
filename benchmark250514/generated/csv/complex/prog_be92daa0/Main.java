import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a custom record separator
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withRecordSeparator("\n");

        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";

        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional operations to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            ArrayList<String> locations = new ArrayList<>();

            for (CSVRecord record : records) {
                names.add(record.get(0));
                ages.add(Integer.parseInt(record.get(1)));
                locations.add(record.get(2));
            }

            // Perform some calculations
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();
            System.out.println("Average Age: " + averageAge);

            // Print all names and locations
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Location: " + locations.get(i));
            }

            // Read the first record and print it
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}