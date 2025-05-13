import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data
        String csvData = "header1,header2\nvalue1,value2\n,,\nvalue3,value4";

        // Create CSVFormat with ignoreEmptyLines set to true
        CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

        ArrayList<HashMap<String, String>> recordsList = new ArrayList<>();

        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Iterate over the records
            for (CSVRecord record : parser) {
                // Create a map to store record data
                HashMap<String, String> recordMap = new HashMap<>();

                // Populate the map with data from the CSV record
                for (int i = 0; i < record.size(); i++) {
                    recordMap.put("header" + (i + 1), record.get(i));
                }

                // Add the map to the list
                recordsList.add(recordMap);

                // Check if the first column is set
                /* read */ boolean isSet = record.isSet(0);

                // Print the result
                System.out.println("Is first column set: " + isSet);

                // Break after the first iteration to ensure read is executed only once
                break;
            }

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional complex operations
        HashMap<String, Integer> summaryMap = new HashMap<>();
        for (HashMap<String, String> record : recordsList) {
            for (String key : record.keySet()) {
                summaryMap.put(key, summaryMap.getOrDefault(key, 0) + 1);
            }
        }

        // Print the summary
        System.out.println("Summary of headers:");
        for (String key : summaryMap.keySet()) {
            System.out.println(key + ": " + summaryMap.get(key));
        }

        // More complex operations
        ArrayList<String> transformedList = new ArrayList<>();
        for (HashMap<String, String> record : recordsList) {
            transformedList.add(record.get("header1") + "-" + record.get("header2"));
        }

        // Print the transformed data
        System.out.println("Transformed Data:");
        for (String data : transformedList) {
            System.out.println(data);
        }
    }
}