import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ csvPrinter.printRecord("value1", "value2", "value3");
            csvPrinter.flush();
            csvPrinter.close();
            
            String csvData = writer.toString();
            StringReader reader = new StringReader(csvData);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);
            for (CSVRecord record : records) {
                /* read */ String value = record.get(0);
                System.out.println(value);
                break; // Ensure read is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}