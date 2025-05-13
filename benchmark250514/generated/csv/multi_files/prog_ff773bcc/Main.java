public class Main {
    public static void main(String[] args) {
        CSVConfiguration config = new CSVConfiguration();
        config.configureNullString("NULL");

        CSVDataProcessor processor = new CSVDataProcessor(config);

        String csvData = "Name,Age\nJohn,30\nJane,NULL\n";

        // Additional processing before parsing CSV data
        int sumOfAgesBefore = processor.getSumOfAges();
        System.out.println("Sum of ages before parsing CSV: " + sumOfAgesBefore);

        // Parse the CSV data
        processor.parseCSVData(csvData);

        // More complex processing after CSV parsing
        processor.addPerson("Doe", 40);
        int sumOfAgesAfter = processor.getSumOfAges();
        System.out.println("Sum of ages after parsing CSV: " + sumOfAgesAfter);
    }
}