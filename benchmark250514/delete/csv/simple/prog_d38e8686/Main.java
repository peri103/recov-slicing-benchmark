import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with escape character
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withEscape('\\');

        // Prepare to write data into a CSV string
        StringWriter out = new StringWriter();
        try (CSVPrinter printer = new CSVPrinter(out, format)) {
            printer.printRecord("Hello", "World");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the CSV record from the generated string
        String csvData = out.toString();
        CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).iterator().next();
        /* read */ String recordString = record.toString();
        
        // Output the read value
        System.out.println(recordString);
    }
}