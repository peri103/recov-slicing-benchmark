import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method withTrim() to modify the format
        /* write */ format = format.withTrim();

        // Simulate a CSVRecord object for reading
        CSVRecord record = new CSVRecord(null, null, null, format);

        // Additional code to make the program more complex
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add("John, Doe, 30");
        dataList.add("Jane, Smith, 25");
        
        // Process each data entry
        for (String data : dataList) {
            String[] splitData = data.split(",");
            System.out.println("Name: " + splitData[0].trim() + " " + splitData[1].trim() + ", Age: " + splitData[2].trim());
        }

        // More operations using the CSVRecord
        boolean isRecordValid = true;
        for (String field : record) {
            if (field == null || field.isEmpty()) {
                isRecordValid = false;
                break;
            }
        }

        // Use the read method isMapped() to check if the record is mapped
        /* read */ boolean isMapped = record.isMapped();
        
        // Print the results
        System.out.println("Is the record mapped? " + isMapped);
        System.out.println("Is the record valid? " + isRecordValid);
    }
}