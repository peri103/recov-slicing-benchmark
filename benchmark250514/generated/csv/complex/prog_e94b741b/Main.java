import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Create a sample CSV string
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional complexity: Create a list of names from the CSV records
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get("name"));
            }

            // Print all names
            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // Perform some calculations
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get("age"));
            }
            System.out.println("Total Age: " + totalAge);

            // Access the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the retrieved comment
            System.out.println("Comment: " + comment);

            // Additional complexity: Reverse the names list and print
            ArrayList<String> reversedNames = new ArrayList<>();
            for (int i = names.size() - 1; i >= 0; i--) {
                reversedNames.add(names.get(i));
            }

            // Print reversed names
            for (String name : reversedNames) {
                System.out.println("Reversed Name: " + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}