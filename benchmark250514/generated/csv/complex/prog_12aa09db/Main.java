import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data
        String csvData = "# This is a comment\nName, Age\nAlice, 30\nBob, 25";
        
        // Initialize CSVFormat and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method
        /* write */ format = format.withCommentMarker('#');

        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();

            for (CSVRecord record : parser) {
                // Extract data
                names.add(record.get(0));
                ages.add(Integer.parseInt(record.get(1)));
                
                // Use the read method
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }

            // Process extracted data
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i));
            }

            // Calculate average age
            int sum = 0;
            for (int age : ages) {
                sum += age;
            }
            double averageAge = sum / (double) ages.size();
            System.out.println("Average Age: " + averageAge);

            // Create a new CSV format for further processing
            CSVFormat newFormat = CSVFormat.DEFAULT.withDelimiter(';');
            System.out.println("New format delimiter: " + newFormat.getDelimiter());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}