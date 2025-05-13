import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV data as a string
        String csvData = "Name, Age, City\nJohn, 30, New York\nJane, 25, Los Angeles";

        // Create CSV configuration
        CSVConfiguration config = new CSVConfiguration();

        // Parse CSV data
        CSVDataParser parser = new CSVDataParser(csvData, config);
        List<CSVRecord> records = parser.getRecords();

        // Analyze CSV data
        CSVAnalyzer analyzer = new CSVAnalyzer(records);
        List<String> names = analyzer.extractNames();

        // Check if "Name" is mapped in the first record
        boolean isMapped = analyzer.isNameMapped(records.get(0));
        System.out.println("Is 'Name' mapped: " + isMapped);

        // Print extracted names
        System.out.println("Names: " + names);
    }
}