import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Configure CSV with null string representation
        CSVConfiguration csvConfig = new CSVConfiguration();
        csvConfig.configureNullString("NULL");

        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,NULL,USA\nJane,25,NULL";

        // Process CSV data
        CSVDataProcessor processor = new CSVDataProcessor(csvConfig, csvData);

        // Check if 'Location' is set in the first record
        boolean isLocationSet = processor.isLocationSetInFirstRecord();
        System.out.println("Is 'Location' set in the first record? " + isLocationSet);

        // Count occurrences of each location
        Map<String, Integer> locationCount = processor.countLocations();
        for (Map.Entry<String, Integer> entry : locationCount.entrySet()) {
            System.out.println("Location: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Check if all records have 'Age' set
        boolean allHaveAge = processor.doAllRecordsHaveAge();
        System.out.println("Do all records have 'Age' set? " + allHaveAge);
    }
}