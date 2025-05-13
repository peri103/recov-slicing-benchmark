import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            String csvData = writer.toString();
            CSVParser parser = CSVParser.parse(csvData, CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);

            /* read */ String value = record.get(0);
            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}