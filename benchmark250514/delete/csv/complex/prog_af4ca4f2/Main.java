import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trimming enabled
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, Country\nJohn Doe, 30, USA\nJane Doe, 25, UK\nAlice, 28, Canada";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format.withHeader());

            // Collect all records into a list
            List<CSVRecord> records = new ArrayList<>();
            for (CSVRecord record : parser) {
                records.add(record);
            }

            // Process each record and print details
            for (CSVRecord record : records) {
                String name = record.get("Name");
                String age = record.get("Age");
                String country = record.get("Country");
                System.out.println("Name: " + name + ", Age: " + age + ", Country: " + country);
            }

            // Perform some additional operations
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
            double averageAge = (double) totalAge / records.size();
            System.out.println("Average Age: " + averageAge);

            // Additional unrelated operations
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                numberList.add(i * 2);
            }

            for (int number : numberList) {
                System.out.println("Number: " + number);
            }

            // Read the first record and check if it's mapped
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped();

            // Output the result
            System.out.println("Is the first record mapped? " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}