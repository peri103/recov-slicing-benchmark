import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a quote character
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withQuote('"');

        // Create a CSVRecord for demonstration
        String[] data = {"value1", "value2"};
        CSVRecord record = new CSVRecord(null, data, null, 0, 0);

        // Use the read method to convert the CSVRecord to a string
        /* read */ String recordString = record.toString();
        System.out.println(recordString);
    }
}