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
        String csvData = "Name,Age,Location\nJohn,25,USA\nJane,30,UK";
        CSVFormat format = CSVFormat.DEFAULT;

        try {
            /* write */ format = format.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            ArrayList<HashMap<String, String>> recordsList = new ArrayList<>();

            for (CSVRecord record : parser) {
                HashMap<String, String> recordMap = new HashMap<>();
                recordMap.put("Name", record.get("Name"));
                recordMap.put("Age", record.get("Age"));
                recordMap.put("Location", record.get("Location"));
                recordsList.add(recordMap);
            }

            // Perform some unrelated operations
            int sumOfAges = 0;
            for (HashMap<String, String> recordMap : recordsList) {
                sumOfAges += Integer.parseInt(recordMap.get("Age"));
            }
            System.out.println("Sum of Ages: " + sumOfAges);

            // Use the read method on the first record
            if (!recordsList.isEmpty()) {
                CSVRecord firstRecord = parser.getRecords().get(0);
                /* read */ boolean isMapped = firstRecord.isMapped("Name");
                System.out.println("Is 'Name' mapped: " + isMapped);
            }

            // More unrelated operations
            int numberOfRecords = recordsList.size();
            System.out.println("Number of Records: " + numberOfRecords);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}