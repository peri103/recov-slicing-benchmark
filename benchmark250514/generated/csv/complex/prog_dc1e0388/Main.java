import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                    /* write */ .withHeaderComments("This is a comment");

            // Sample CSV data
            String csvData = "Name, Age\nJohn, 30\nJane, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();

            // Additional code to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();

            for (CSVRecord record : records) {
                names.add(record.get("Name"));
                ages.add(Integer.parseInt(record.get("Age")));
            }

            // Perform some operations on names and ages
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i));
            }

            // Assuming we want to get the comment from the first record
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println("Comment: " + comment);
            }

            // More complex operations
            int totalAge = ages.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total Age: " + totalAge);

            // Check if all ages are above a certain threshold
            boolean allAbove25 = ages.stream().allMatch(age -> age > 25);
            System.out.println("All ages above 25: " + allAbove25);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}