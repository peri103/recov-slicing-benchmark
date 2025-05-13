import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

            // Prepare to write to a CSV string
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a sample record
            printer.printRecord("Column1", "Column2");

            // Close the printer
            printer.close();

            // Read the CSV string
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();

            // Assuming we read the first record
            CSVRecord record = records.get(0);

            // Retrieve the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}