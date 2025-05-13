import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Step 2: Prepare a sample CSV data
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

        try {
            // Step 3: Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Step 4: Process each record and store in a list
            ArrayList<HashMap<String, String>> recordsList = new ArrayList<>();
            for (CSVRecord record : parser) {
                HashMap<String, String> recordMap = new HashMap<>();
                for (String header : parser.getHeaderMap().keySet()) {
                    recordMap.put(header, record.get(header));
                }
                recordsList.add(recordMap);
            }

            // Step 5: Perform additional operations on recordsList
            int totalAge = 0;
            for (HashMap<String, String> recordMap : recordsList) {
                totalAge += Integer.parseInt(recordMap.get("age"));
            }
            System.out.println("Total Age: " + totalAge);

            // Step 6: Get the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Step 7: Use the read method to check if the header "name" is set
            /* read */ boolean isNameSet = firstRecord.isSet("name");

            // Step 8: Output the result
            System.out.println("Is 'name' header set in the first record: " + isNameSet);

            // Step 9: Additional unrelated operations
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numberList.add(i * 10);
            }
            for (int number : numberList) {
                System.out.println("Number: " + number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}