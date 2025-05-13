import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVPrinter csvPrinter = null;
        try {
            csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ csvPrinter.print("Hello, world!");
            csvPrinter.flush(); // Ensure data is written to the writer

            String csvData = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvData), CSVFormat.DEFAULT);
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String value = record.get(0);
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (csvPrinter != null) {
                    csvPrinter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}