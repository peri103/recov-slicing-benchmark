import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');

            // Sample CSV data with a comment
            String csvData = "# This is a comment\nname,age\nJohn,30\nDoe,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a StringWriter for output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Add additional data using CSVPrinter
            printer.printRecord(Arrays.asList("Alice", "22"));
            printer.printRecord(Arrays.asList("Bob", "28"));

            // Iterate through records to find the comment
            for (CSVRecord record : parser) {
                String comment = /* read */ record.getComment();
                if (comment != null) {
                    System.out.println(comment); // Output the comment
                    break; // Ensure the read method is executed only once
                }
            }

            // Output the additional data
            System.out.println(writer.toString());

            // Parse the newly added data
            String newCsvData = writer.toString();
            CSVParser newParser = CSVParser.parse(new StringReader(newCsvData), CSVFormat.DEFAULT);

            // Iterate through the new records
            for (CSVRecord newRecord : newParser) {
                System.out.println("Name: " + newRecord.get(0) + ", Age: " + newRecord.get(1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}