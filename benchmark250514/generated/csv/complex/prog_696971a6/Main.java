import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');

            // Sample CSV data
            String csvData = "name;age;city\nJohn;30;New York\nJane;25;Los Angeles";

            // Parse the CSV data using the format with the specified delimiter
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Unrelated code to make the program more complex
            ArrayList<HashMap<String, String>> userInfoList = new ArrayList<>();
            for (CSVRecord record : records) {
                HashMap<String, String> userInfo = new HashMap<>();
                userInfo.put("name", record.get(0));
                userInfo.put("age", record.get(1));
                userInfo.put("city", record.get(2));
                userInfoList.add(userInfo);
            }

            // Further processing with the userInfoList
            for (HashMap<String, String> userInfo : userInfoList) {
                System.out.println("User Info: " + userInfo);
            }

            // Assume we want to read the first record as a string
            /* read */ String recordString = records.get(0).toString();
            System.out.println("First Record String: " + recordString);

            // More unrelated code to make the program complex
            HashMap<String, Integer> cityCount = new HashMap<>();
            for (HashMap<String, String> userInfo : userInfoList) {
                String city = userInfo.get("city");
                cityCount.put(city, cityCount.getOrDefault(city, 0) + 1);
            }

            System.out.println("City Count: " + cityCount);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}