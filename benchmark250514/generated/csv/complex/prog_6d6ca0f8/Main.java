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
            // Prepare a CSV format with escape character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withEscape('\\');

            // Sample CSV content
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0);

            // Create a list to store CSV records
            ArrayList<CSVRecord> recordList = new ArrayList<>();
            for (CSVRecord rec : parser) {
                recordList.add(rec);
            }

            // Create a map to store names and ages from CSV records
            HashMap<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord rec : recordList) {
                String name = rec.get(0);
                int age = Integer.parseInt(rec.get(1));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (String name : nameAgeMap.keySet()) {
                int age = nameAgeMap.get(name);
                System.out.println(name + " is " + age + " years old.");
            }

            // Read the first record
            /* read */ String recordString = record.toString();
            System.out.println(recordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}