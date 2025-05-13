import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withQuote('"');
            
            // Use the format to write data
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);
            printer.printRecord("Example", "Data", "123");
            printer.flush();
            
            // Parse the written data into a CSVRecord for reading
            String csvData = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).iterator().next();
            
            /* read */ String value = record.toString();
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}