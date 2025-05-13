import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "#This is a comment\n" +
                         "header1,header2\n" +
                         "value1,value2";

        // Handle CSV data
        CSVDataHandler csvHandler = new CSVDataHandler();
        csvHandler.parseCSV(csvData);

        // Read comment from CSV records
        CSVCommentReader commentReader = new CSVCommentReader(csvHandler.getCSVRecords());
        String comment = commentReader.readComment();
        System.out.println("Comment: " + comment);

        // Create a HashMap to store header-value pairs
        HashMap<String, String> dataMap = new HashMap<>();

        // Populate the HashMap with data from the CSV records
        for (CSVRecord record : csvHandler.getCSVRecords()) {
            for (int i = 0; i < record.size(); i++) {
                dataMap.put(record.getParser().getHeaderNames().get(i), record.get(i));
            }
        }

        // Perform operations on the HashMap
        for (String key : dataMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
        }

        // Additional operations on the data
        int sum = 0;
        for (String value : dataMap.values()) {
            if (value.matches("\\d+")) {
                sum += Integer.parseInt(value);
            }
        }
        System.out.println("Sum of numeric values: " + sum);
    }
}