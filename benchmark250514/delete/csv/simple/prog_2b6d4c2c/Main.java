import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Create a mock CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, new String[]{"field1", "field2"}, null, 0, 0);

        // Use the isSet method to check if a field is set
        /* read */ boolean isFieldSet = record.isSet("field1");

        System.out.println("Is 'field1' set: " + isFieldSet);
    }
}