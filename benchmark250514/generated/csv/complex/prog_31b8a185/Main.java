import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "name,age\nAlice,30\nBob,25";
            StringReader reader = new StringReader(csvData);

            // Create CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withQuote('"');

            // Parse CSV data
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Create an unrelated list to increase complexity
            ArrayList<String> namesList = new ArrayList<>();
            for (CSVRecord record : records) {
                namesList.add(record.get(0));
            }

            // Perform some operations on the unrelated list
            for (int i = 0; i < namesList.size(); i++) {
                namesList.set(i, namesList.get(i).toUpperCase());
            }

            // Output the unrelated list
            System.out.println("Names List: " + namesList);

            // More complex operations: calculating average age
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get(1));
            }
            double averageAge = (double) totalAge / records.size();
            System.out.println("Average Age: " + averageAge);

            // Read from CSVRecord
            /* read */ String recordString = records.get(0).toString();

            // Output the result
            System.out.println("First Record: " + recordString);

            // Perform another operation: filter names starting with 'A'
            List<String> filteredNames = new ArrayList<>();
            for (String name : namesList) {
                if (name.startsWith("A")) {
                    filteredNames.add(name);
                }
            }
            System.out.println("Filtered Names: " + filteredNames);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}