import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVConfig and configure it
            CSVConfig csvConfig = new CSVConfig();
            csvConfig.configureFormat();

            // Sample CSV data
            String csvData = "Name, Age\nJohn, 30\nJane, 25";

            // Process the CSV data
            CSVDataProcessor processor = new CSVDataProcessor(csvConfig, csvData);
            HashMap<String, Integer> ageMap = processor.processRecords();

            // Process the map and print the ages
            for (String name : ageMap.keySet()) {
                System.out.println(name + "'s age is " + ageMap.get(name));
            }

            // More unrelated code
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total age: " + totalAge);

            // Get the first record
            CSVRecord record = processor.getFirstRecord();

            // Check if a header is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println(isMapped);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}