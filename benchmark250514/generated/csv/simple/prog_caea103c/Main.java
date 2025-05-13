import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();

            // Create a CSVPrinter instance
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Use the write method
            /* write */ printer.printComment("This is a comment");

            // Flush and close the printer
            printer.flush();
            printer.close();

            // Read the output from the StringWriter
            String csvOutput = writer.toString();

            // Parse the CSV output into CSVRecord using CSVFormat
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvOutput)).getRecords();

            // Ensure the records list is not empty and read the comment
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);

                // Use the read method
                /* read */ String comment = record.getComment();

                // Print the comment
                System.out.println(comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}