import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ csvPrinter.print("Hello, World!");
            csvPrinter.flush();

            Reader reader = new StringReader(writer.toString());
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            List<CSVRecord> records = csvParser.getRecords();
            /* read */ String value = records.get(0).get(0);
            System.out.println(value);

            csvPrinter.close();
            csvParser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}