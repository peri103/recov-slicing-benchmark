import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom quote character
            CSVFormat format = CSVFormat.DEFAULT /* write */.withQuote('"');
            
            // Prepare a sample CSV input
            String csvData = "\"Name\",\"Age\"\n\"John Doe\",\"30\"\n\"Jane Doe\",\"25\"";
            StringReader reader = new StringReader(csvData);
            
            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(reader, format);
            List<CSVRecord> records = parser.getRecords();
            
            // Process each record
            ArrayList<String> recordStrings = new ArrayList<>();
            for (CSVRecord record : records) {
                recordStrings.add(record.toString());
            }
            
            // Perform some unrelated operations
            int sumOfAges = 0;
            for (CSVRecord record : records) {
                String ageString = record.get(1);
                int age = Integer.parseInt(ageString);
                sumOfAges += age;
            }
            System.out.println("Sum of Ages: " + sumOfAges);
            
            // Read the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ String firstRecordString = firstRecord.toString();
            
            // Print the CSV record as a string
            System.out.println("First Record: " + firstRecordString);
            
            // Print all records
            for (String recordString : recordStrings) {
                System.out.println("Record: " + recordString);
            }
            
            // Close the parser
            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}