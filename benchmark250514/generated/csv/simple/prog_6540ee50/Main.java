import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment to the CSV
            /* write */ csvPrinter.printComment("This is a comment");
            csvPrinter.flush();

            // Prepare a StringReader to read the CSV output
            StringReader reader = new StringReader(writer.toString());

            // Parse the CSV output
            CSVParser parser = CSVFormat.DEFAULT.parse(reader);

            // Read the comment from the CSV
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

            // Close resources
            csvPrinter.close();
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}