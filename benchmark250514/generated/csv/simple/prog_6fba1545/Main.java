import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write operation
            /* write */ csvPrinter.print("Hello");

            csvPrinter.flush();
            csvPrinter.close();

            // Read operation
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);
            
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}