import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Use CSVFormat to configure the comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Step 2: Prepare a CSV input string containing a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Step 3: Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Unrelated code to make the program more complex
            ArrayList<String> headerList = new ArrayList<>();
            headerList.add("header1");
            headerList.add("header2");

            HashMap<String, String> recordMap = new HashMap<>();
            recordMap.put("header1", "value1");
            recordMap.put("header2", "value2");

            // Simulate processing of headers
            for (String header : headerList) {
                System.out.println("Processing header: " + header);
            }

            // Simulate processing of record values
            for (String key : recordMap.keySet()) {
                System.out.println("Processing record: " + key + " -> " + recordMap.get(key));
            }

            // Step 4: Iterate over the records and retrieve the comment
            for (CSVRecord record : parser) {
                // Simulate unrelated operations before reading the comment
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }
                System.out.println("Sum of numbers from 1 to 10: " + sum);

                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }

            // More unrelated operations to make the program more complex
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }

            for (int i = 0; i < numbers.size(); i++) {
                System.out.println("Number at index " + i + ": " + numbers.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}