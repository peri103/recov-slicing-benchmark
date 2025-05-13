import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the output of CSVPrinter
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter instance
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment using CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");

            // Flush and close the printer
            csvPrinter.flush();
            csvPrinter.close();

            // Retrieve the comment from the CSV output
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            // Assuming the comment is part of the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the retrieved comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}