import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CustomCSVReader {
    private String csvContent;

    public CustomCSVReader(String csvContent) {
        this.csvContent = csvContent;
    }

    public void readFirstRecord() throws IOException {
        Reader inputReader = new StringReader(csvContent);
        CSVParser parser = CSVParser.parse(inputReader, CSVFormat.DEFAULT);

        for (CSVRecord csvRecord : parser) {
            /* read */ String value = csvRecord.get(0);
            System.out.println(value);
            break; // Ensure the read operation is executed only once
        }
    }
}
