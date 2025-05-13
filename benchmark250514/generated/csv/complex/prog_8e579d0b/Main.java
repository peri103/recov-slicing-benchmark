import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces();

        // Sample CSV data
        String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

        // Additional complexity: using another CSV format and parsing
        CSVFormat anotherFormat = CSVFormat.RFC4180.withHeader("name", "age");
        String anotherCsvData = "Alice, 28\nBob, 22";
        List<CSVRecord> anotherRecords = null;

        try {
            anotherRecords = anotherFormat.parse(new StringReader(anotherCsvData)).getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Process the additional CSV records
        if (anotherRecords != null) {
            for (CSVRecord record : anotherRecords) {
                System.out.println("Name: " + record.get("name") + ", Age: " + record.get("age"));
            }
        }

        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Unrelated complex code: Perform operations on a list
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numberList.add(i * 2);
            }

            for (int number : numberList) {
                System.out.println("Number: " + number);
            }

            // Read using the read method
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Is the record consistent? " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}