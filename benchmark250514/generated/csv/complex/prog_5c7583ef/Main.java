import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Simulate CSV data
        String csvData = "name,age,city\nJohn,30,NULL\nJane,NULL,New York";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);
            List<CSVRecord> records = parser.getRecords();

            // Additional unrelated operations
            int sum = 0;
            for (CSVRecord record : records) {
                String ageStr = record.get("age");
                if (ageStr != null && !ageStr.equals("NULL")) {
                    sum += Integer.parseInt(ageStr);
                }
            }
            System.out.println("Total age sum: " + sum);

            // More operations
            String[] cities = new String[records.size()];
            int index = 0;
            for (CSVRecord record : records) {
                cities[index++] = record.get("city");
            }
            System.out.println("Cities: " + Arrays.toString(cities));

            // Read and check if a value is set in the first record
            /* read */ boolean isSet = records.get(0).isSet("age");
            System.out.println("Is 'age' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}