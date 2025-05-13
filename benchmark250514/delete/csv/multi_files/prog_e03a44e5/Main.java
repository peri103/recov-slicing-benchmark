import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat csvFormat = CSVFormat.DEFAULT;

        // Initialize unrelated data structures
        ArrayList<String> names = new ArrayList<>();
        HashMap<String, Integer> ageMap = new HashMap<>();

        // Populate the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Populate the HashMap
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        // Use the write method
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

        // Process the names list
        for (String name : names) {
            System.out.println("Processing: " + name);
            if (ageMap.containsKey(name)) {
                System.out.println(name + " is " + ageMap.get(name) + " years old.");
            }
        }

        // Create a CSVRecord object for demonstration purposes
        String[] headers = {"Name", "Age", "Country"};
        String[] values = {"Alice", "30", "USA"};
        CSVRecord csvRecord = CSVFormat.DEFAULT.parse(new java.io.StringReader("Name,Age,Country\nAlice,30,USA")).getRecords().get(0);

        // Additional processing unrelated to CSV
        int sumOfAges = 0;
        for (String name : names) {
            sumOfAges += ageMap.get(name);
        }
        System.out.println("Total sum of ages: " + sumOfAges);

        // Use the read method
        /* read */ boolean isMapped = csvRecord.isMapped("Name");

        // Output the result of the read operation
        System.out.println("Is 'Name' mapped in CSV record: " + isMapped);

        // Further processing
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name at index " + i + ": " + names.get(i));
        }

        // Student enrollment demonstration
        Student student = new Student("Alice", 30);
        student.enrollCourse("Math");
        System.out.println("Is Alice enrolled in Math? " + student.isEnrolled("Math"));
    }
}