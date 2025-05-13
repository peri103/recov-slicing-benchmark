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
            
            // Create a CSVPrinter instance with a specific format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Use the write method to print a comment
            /* write */ printer.printComment("This is a comment");

            // Flush the printer to ensure all data is written to the writer
            printer.flush();
            
            // Simulate reading the CSVRecord from the written data
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();

            // Assume we have a way to access the comment from the first record
            // Use the read method to get the comment
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}