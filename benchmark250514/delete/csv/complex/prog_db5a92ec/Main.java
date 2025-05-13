import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat with the write method
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase(true);

        // Create a sample CSVRecord for testing the read method
        String[] headers = {"Name", "Age"};
        String[] values = {"John Doe", "30"};
        CSVRecord record = CSVFormat.DEFAULT.parse(Arrays.asList(values)).getRecords().get(0);

        // Additional complex code using ArrayList
        List<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");

        // Process the list and print names
        for (String name : namesList) {
            System.out.println("Processing name: " + name);
        }

        // Add more complexity with nested loops
        for (int i = 0; i < namesList.size(); i++) {
            for (int j = 0; j < headers.length; j++) {
                System.out.println("Header: " + headers[j] + ", Name: " + namesList.get(i));
            }
        }

        // Check if a header is mapped using the read method
        /* read */ boolean isMapped = record.isMapped("name");
        System.out.println("Is 'name' header mapped: " + isMapped);

        // More code to manipulate lists
        List<Integer> ageList = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            try {
                ageList.add(Integer.parseInt(values[i]));
            } catch (NumberFormatException e) {
                System.out.println("Invalid age format for value: " + values[i]);
            }
        }

        // Print ages
        for (Integer age : ageList) {
            System.out.println("Age: " + age);
        }
    }
}