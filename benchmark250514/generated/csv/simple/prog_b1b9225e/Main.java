import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVFormat instance with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

            // Use CSVPrinter to write data
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("header1", "header2");
            printer.printRecord("value1", "value2");
            printer.flush();
            
            // Parse the written CSV data
            String csvData = writer.toString();
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve records
            List<CSVRecord> records = parser.getRecords();
            
            // Read the comment from the first record
            String comment = /* read */ records.get(0).getComment();
            System.out.println(comment);

            // Close resources
            parser.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}