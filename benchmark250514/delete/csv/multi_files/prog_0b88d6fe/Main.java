import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVConfig config = new CSVConfig();
        config.configureFormat(); // This configures the format with surrounding spaces ignored

        String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";
        CSVDataProcessor processor = new CSVDataProcessor();
        processor.parseData(config, csvData);

        List<String> names = processor.getNames();
        for (String name : names) {
            System.out.println("Processing name: " + name);
        }

        int totalAge = processor.getTotalAge();
        System.out.println("Total age: " + totalAge);

        CSVRecord firstRecord = processor.getFirstRecord();
        /* read */ boolean isSet = firstRecord.isSet("Name");
        System.out.println("Is 'Name' column set in the first record? " + isSet);
    }
}