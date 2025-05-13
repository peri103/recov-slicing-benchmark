import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to set the format to ignore empty lines
        /* write */ format = format.withIgnoreEmptyLines(true);

        // Create a CSVRecord instance with some sample data
        CSVRecord record = new CSVRecord(null, new String[]{"value1", "value2"}, format);

        // Additional complexity: Using a list to store CSV records
        List<CSVRecord> recordsList = new ArrayList<>();
        recordsList.add(record);

        // Processing the records
        for (CSVRecord rec : recordsList) {
            System.out.println("Processing record: " + rec.toString());
        }

        // Additional complexity: Adding more records with different formats
        CSVFormat otherFormat = CSVFormat.DEFAULT.withIgnoreHeaderCase();
        CSVRecord anotherRecord = new CSVRecord(null, new String[]{"value3", "value4"}, otherFormat);
        recordsList.add(anotherRecord);

        // Iterate over records and perform some operations
        for (CSVRecord rec : recordsList) {
            System.out.println("Record values: ");
            for (int i = 0; i < rec.size(); i++) {
                System.out.println("Value at index " + i + ": " + rec.get(i));
            }
        }

        // Use the read method to check if a specific index is set
        /* read */ boolean isSet = record.isSet(0);

        // Print the result
        System.out.println("Is index 0 set in the first record? " + isSet);

        // Additional complexity: Checking indices in other records
        boolean isSetOther = anotherRecord.isSet(1);
        System.out.println("Is index 1 set in the second record? " + isSetOther);

        // Further processing and manipulation
        List<String> extractedValues = new ArrayList<>();
        for (CSVRecord rec : recordsList) {
            extractedValues.add(rec.get(0));
        }

        // Print extracted values
        System.out.println("Extracted values from records:");
        for (String value : extractedValues) {
            System.out.println(value);
        }
    }
}