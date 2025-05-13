import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
            
            // Create a sample CSV data
            String csvData = "name,age\nJohn Doe,30\nJane Doe,25";
            
            // Parse the CSV data using the format
            CSVParser parser = format.parse(new StringReader(csvData));
            List<CSVRecord> records = parser.getRecords();
            
            // Additional logic: Store parsed records in a list
            List<String> recordStrings = new ArrayList<>();
            for (CSVRecord record : records) {
                recordStrings.add(record.toString());
            }
            
            // Perform some operations on the list
            for (int i = 0; i < recordStrings.size(); i++) {
                String transformedRecord = recordStrings.get(i).replace("Doe", "Smith");
                recordStrings.set(i, transformedRecord);
            }
            
            // Initialize another CSVFormat for different operations
            CSVFormat anotherFormat = CSVFormat.DEFAULT.withQuote('"');
            String anotherCsvData = "city,country\nNew York,USA\nLondon,UK";
            CSVParser anotherParser = anotherFormat.parse(new StringReader(anotherCsvData));
            List<CSVRecord> anotherRecords = anotherParser.getRecords();
            
            // Process the second set of records
            for (CSVRecord anotherRecord : anotherRecords) {
                System.out.println("Processing: " + anotherRecord.toString());
            }
            
            // Read the first record and convert it to string
            /* read */ String recordString = records.get(0).toString();
            
            // Print the first record string
            System.out.println(recordString);
            
            // Print transformed records
            for (String transformedRecord : recordStrings) {
                System.out.println("Transformed: " + transformedRecord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}