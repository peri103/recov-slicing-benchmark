import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */ .withCommentMarker('#');
            
            // Sample CSV data with a comment
            String csvData = "# This is a comment\nname,age\nJohn,30\nDoe,25";
            
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            
            // Additional complexity: process CSV data
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            
            for (CSVRecord record : records) {
                if (record.getRecordNumber() > 1) { // Skip the comment and header
                    names.add(record.get(0));
                    ages.add(Integer.parseInt(record.get(1)));
                }
            }
            
            // Process the names and ages
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            
            double averageAge = totalAge / (double) ages.size();
            System.out.println("Average Age: " + averageAge);
            
            // Read the comment from the first record (which is the comment line)
            String comment = records.get(0) /* read */ .getComment();
            
            // Output the comment
            System.out.println("Comment: " + comment);
            
            // Additional complexity: print names in reverse order
            for (int i = names.size() - 1; i >= 0; i--) {
                System.out.println("Name: " + names.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}