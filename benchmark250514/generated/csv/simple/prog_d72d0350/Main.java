import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');

            // Sample CSV data with a comment
            String csvData = "# This is a comment\nname,age\nJohn,30\nDoe,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Iterate through records to find the comment
            for (CSVRecord record : parser) {
                String comment = /* read */ record.getComment();
                if (comment != null) {
                    System.out.println(comment); // Output the comment
                    break; // Ensure the read method is executed only once
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}