import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a header comment");

            // Create a CSVPrinter to write the CSV data
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write some sample data
            printer.printRecord("Name", "Age", "Country");
            printer.printRecord("Alice", "30", "USA");
            printer.printRecord("Bob", "25", "UK");
            
            // Flush and close the printer
            printer.flush();
            printer.close();

            // Parse the written CSV data
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();

            // Assume the comment is associated with the first record
            CSVRecord firstRecord = records.get(0);
            
            /* read */ String comment = firstRecord.getComment();
            System.out.println(comment);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}