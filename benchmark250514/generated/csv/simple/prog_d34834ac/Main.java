import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a header comment
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Prepare a StringWriter to capture the CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a sample record to the CSV
            printer.printRecord("Column1", "Column2");
            printer.printRecord("Value1", "Value2");
            printer.flush();

            // Parse the CSV output
            CSVParser parser = CSVParser.parse(writer.toString(), format);

            // Read the comment from the first record
            List<CSVRecord> records = parser.getRecords();
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}