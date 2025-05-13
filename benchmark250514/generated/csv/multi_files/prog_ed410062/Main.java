public class Main {
    public static void main(String[] args) {
        // Configure CSV format
        CSVConfiguration config = new CSVConfiguration();
        config.configureFormat();

        // Process CSV data
        CSVDataProcessor processor = new CSVDataProcessor();
        String csvData = "name, age, city\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";
        processor.parseCSVData(csvData, config);

        // Create person object from CSV data
        String name = processor.getName();
        int age = processor.getAge();
        Person person = new Person(name, age);
        person.displayInfo();

        // Check if 'name' is mapped
        boolean isMapped = processor.isNameMapped();
        System.out.println("Is 'name' mapped: " + isMapped);
    }
}