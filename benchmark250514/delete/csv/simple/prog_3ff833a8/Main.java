import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a quote character
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withQuote('"');

        // Create a mock CSVRecord for demonstration
        String[] values = {"value1", "value2", "value3"};
        CSVRecord csvRecord = CSVFormat.DEFAULT.parse(values).getRecords().get(0);

        // Read and print the CSVRecord
        /* read */ String recordString = csvRecord.toString();
        System.out.println(recordString);
    }
}