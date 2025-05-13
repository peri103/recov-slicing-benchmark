import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name, Age, City\nJohn, 30, New York\n, , \nJane, 25, Los Angeles";

        CSVHandler csvHandler = new CSVHandler();
        csvHandler.configureCSVFormat();

        try {
            List<CSVRecord> records = csvHandler.parseCSV(csvData);
            CSVAnalyzer csvAnalyzer = new CSVAnalyzer(records);

            // Output the result of the original read
            boolean isSet = csvAnalyzer.isNameSetInFirstRecord();
            System.out.println("Is 'Name' set in the first record? " + isSet);

            // Additional processing and output
            System.out.println("Names from CSV:");
            for (String name : csvAnalyzer.getNames()) {
                System.out.println(name);
            }

            System.out.println("Age map:");
            for (String name : csvAnalyzer.getAgeMap().keySet()) {
                System.out.println(name + ": " + csvAnalyzer.getAgeMap().get(name));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}