import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Sample CSV data with a comment
            String csvData = "# This is a comment\nname,age\nJohn,30\nDoe,40";
            
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional code to manipulate CSV records
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            for (int i = 1; i < records.size(); i++) {
                CSVRecord record = records.get(i);
                names.add(record.get(0));
                ages.add(Integer.parseInt(record.get(1)));
            }
            
            // Print names and ages
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i));
            }

            // Calculate average age
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = (double) totalAge / ages.size();
            System.out.println("Average Age: " + averageAge);

            // Read the comment from the first record (which is the comment line)
            /* read */ String comment = records.get(0).getComment();
            
            // Print the comment
            System.out.println("Comment: " + comment);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}