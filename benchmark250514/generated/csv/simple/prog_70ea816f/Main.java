import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter with default CSV format
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment to the CSV output
            /* write */ printer.printComment("This is a comment");

            // Flush and close the printer
            printer.flush();
            printer.close();

            // Simulate reading the CSV record from the written CSV output
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            
            // Assuming the comment is stored in a CSVRecord, read the comment
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