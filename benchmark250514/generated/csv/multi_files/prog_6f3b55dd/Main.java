import java.io.IOException;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";

            // Initialize CSV utility
            CSVUtility csvUtility = new CSVUtility(csvData);

            // Initialize student manager and process CSV records
            StudentManager manager = new StudentManager();
            manager.processCSVRecords(csvUtility.getRecords());

            // Perform operations on the student data
            manager.printStudentDetails();

            // Get the first record
            CSVRecord record = csvUtility.getRecords().get(0);

            // Check if 'Name' is mapped
            /* read */ boolean isMapped = record.isMapped("Name");

            // Output the result
            System.out.println("Is 'Name' mapped: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}