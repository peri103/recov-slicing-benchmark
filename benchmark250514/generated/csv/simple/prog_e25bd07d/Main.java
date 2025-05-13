import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a quote character
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withQuote('"');

            // Sample CSV data
            String csvData = "\"Name\",\"Age\"\n\"John Doe\",\"30\"";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the first record and convert it to string
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}