import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a CSVRecord object for demonstration
        String[] data = {"value1", null, "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader("value1,NULL,value3")).iterator().next();

        // Check if a specific position in the record is set
        /* read */ boolean isSet = record.isSet(1); // This should check if the second value is set

        // Output the result
        System.out.println(isSet);
    }
}