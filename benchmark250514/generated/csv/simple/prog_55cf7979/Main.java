import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withHeader("Column1");
            
            // Create a CSVPrinter instance
            CSVPrinter printer = new CSVPrinter(writer, format);
            
            // Write a value using CSVPrinter
            /* write */ printer.print("Hello, World!");
            printer.flush();
            
            // Read the written value using CSVParser and CSVRecord
            StringReader reader = new StringReader(writer.toString());
            CSVParser parser = CSVFormat.DEFAULT.withHeader("Column1").parse(reader);
            List<CSVRecord> records = parser.getRecords();
            
            // Assuming we're interested in the first record and the first column
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String value = record.get("Column1");
                System.out.println(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}