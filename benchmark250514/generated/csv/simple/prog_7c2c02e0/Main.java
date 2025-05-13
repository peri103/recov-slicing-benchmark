import java.io.StringWriter;
import java.io.IOException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write the CSV data
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment using the CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");

            // Flush and close the printer to ensure all data is written
            csvPrinter.flush();
            csvPrinter.close();

            // Parse the written CSV data to read it back
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT.withCommentMarker('#'));

            // Assuming we have a record to read from, get the comment
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}