import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to allow missing column names
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Assuming we have a CSVRecord to read from, normally this would come from parsing a CSV file
        // For demonstration purposes, we will create a mock CSVRecord
        CSVRecord record = new CSVRecord(format, new Object[0], new String[0], 0, 0);

        // Use the read method to check if a column is set
        /* read */ boolean isColumnSet = record.isSet("ColumnName");

        // Print the result
        System.out.println(isColumnSet);
    }
}