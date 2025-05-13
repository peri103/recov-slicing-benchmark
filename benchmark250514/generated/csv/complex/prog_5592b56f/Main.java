import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with a quote character
            CSVFormat format = CSVFormat.DEFAULT /* write */.withQuote('"');

            // Example CSV data
            String csvData = "\"Name\",\"Age\"\n\"Alice\",\"30\"\n\"Bob\",\"25\"";
            String csvData2 = "\"City\",\"Population\"\n\"New York\",\"8000000\"\n\"Los Angeles\",\"4000000\"";

            // Parse the CSV data using the format with quotes
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            CSVParser parser2 = new CSVParser(new StringReader(csvData2), format);

            // Process the first CSV data
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : parser) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                ageMap.put(name, age);
            }

            // Process the second CSV data
            Map<String, Integer> populationMap = new HashMap<>();
            for (CSVRecord record : parser2) {
                String city = record.get(0);
                int population = Integer.parseInt(record.get(1));
                populationMap.put(city, population);
            }

            // Read the first record from the first parser
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Use the toString method to read the record
            /* read */ String recordString = firstRecord.toString();

            // Output the result
            System.out.println("First CSV Record: " + recordString);

            // Output the processed data
            System.out.println("Age Map: " + ageMap);
            System.out.println("Population Map: " + populationMap);

            // Close the parsers
            parser.close();
            parser2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}