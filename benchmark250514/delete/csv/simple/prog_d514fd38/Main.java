import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withQuote('"');
        
        // Simulate a CSVRecord to demonstrate the read method
        String[] data = {"value1", "value2"};
        CSVRecord record = CSVFormat.DEFAULT.parse(String.join(",", data)).getRecords().get(0);

        /* read */ String recordString = record.toString();
        System.out.println(recordString);
    }
}