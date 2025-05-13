import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Create a CSV format instance with a quote character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
            
            // Step 2: Define some sample CSV data
            String csvData = "\"Name\",\"Age\"\n\"John Doe\",\"30\"\n\"Jane Smith\",\"25\"";
            
            // Step 3: Parse the CSV data using the format
            StringReader reader = new StringReader(csvData);
            List<CSVRecord> records = format.parse(reader).getRecords();
            
            // Step 4: Perform some unrelated operations to increase complexity
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            
            for (CSVRecord record : records) {
                if (record.size() == 2) {
                    names.add(record.get(0));
                    try {
                        ages.add(Integer.parseInt(record.get(1)));
                    } catch (NumberFormatException e) {
                        ages.add(0); // Default age if parsing fails
                    }
                }
            }
            
            // Step 5: Process the names and ages lists
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i));
            }
            
            // Step 6: Perform additional operations
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = (ages.isEmpty()) ? 0 : (double) totalAge / ages.size();
            System.out.println("Average Age: " + averageAge);
            
            // Step 7: Read the first record and print it
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);
            
            // Step 8: Further unrelated operations to increase complexity
            ArrayList<String> reversedNames = new ArrayList<>();
            for (int i = names.size() - 1; i >= 0; i--) {
                reversedNames.add(names.get(i));
            }
            System.out.println("Reversed Names: " + reversedNames);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}