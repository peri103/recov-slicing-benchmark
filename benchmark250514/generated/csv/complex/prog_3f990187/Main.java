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
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV input
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Additional complex logic
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord rec : records) {
                names.add(rec.get("name"));
            }

            // Process names
            StringBuilder processedNames = new StringBuilder();
            for (String name : names) {
                processedNames.append(name.toUpperCase()).append(" ");
            }
            System.out.println("Processed Names: " + processedNames.toString().trim());

            // More complex logic
            int sumOfAges = 0;
            for (CSVRecord rec : records) {
                sumOfAges += Integer.parseInt(rec.get("age"));
            }
            System.out.println("Sum of Ages: " + sumOfAges);

            /* read */ String comment = record.getComment();
            
            // Print the comment
            System.out.println("Comment: " + comment);

            // Additional unrelated logic
            ArrayList<Integer> ageList = new ArrayList<>();
            for (CSVRecord rec : records) {
                ageList.add(Integer.parseInt(rec.get("age")));
            }

            // Calculate average age
            double averageAge = sumOfAges / (double) ageList.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}