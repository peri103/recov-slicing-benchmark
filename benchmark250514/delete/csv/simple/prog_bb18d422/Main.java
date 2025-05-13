import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        
        // Create a CSVRecord with some sample data
        String[] sampleData = {"value1", "value2", "NULL"};
        CSVRecord record = new CSVRecord(sampleData, null, format);

        // Use the write method once
        /* write */ format = format.withNullString("NULL");

        // Use the read method once
        /* read */ boolean isSet = record.isSet(2);
        
        // Print the result of the read method
        System.out.println(isSet);
    }
}