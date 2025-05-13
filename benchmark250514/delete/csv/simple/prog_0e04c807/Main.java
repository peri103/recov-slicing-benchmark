import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to modify the CSVFormat object
        /* write */ format = format.withTrailingDelimiter();

        // Create a sample CSVRecord for testing purposes
        String[] sampleData = {"value1", "value2", "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(String.join(",", sampleData)))
                .iterator().next();

        // Use the read method to interact with the CSVRecord object
        /* read */ boolean isSet = record.isSet(1);

        // Print the result
        System.out.println(isSet);
    }
}