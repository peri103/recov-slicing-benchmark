import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize necessary objects
        StringWriter writer = new StringWriter();
        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

        // Write a record using CSVPrinter
        /* write */ printer.printRecord("value1", "value2", "value3");
        printer.close();

        // Read the record using CSVRecord
        StringReader reader = new StringReader(writer.toString());
        List<CSVRecord> records = CSVFormat.DEFAULT.parse(reader).getRecords();
        /* read */ String value = records.get(0).get(0);

        // Output the read value
        System.out.println(value);
    }
}