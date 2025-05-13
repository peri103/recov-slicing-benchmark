import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV configuration
        CSVConfiguration csvConfig = new CSVConfiguration();

        // Sample CSV data to parse
        String csvData = "name,age\nJohn,30\nJane,25";
        StringReader stringReader = new StringReader(csvData);

        try {
            // Parse the CSV data
            CSVParser parser = csvConfig.getFormat().parse(stringReader);
            List<CSVRecord> records = parser.getRecords();

            // Process CSV data
            CSVDataProcessor processor = new CSVDataProcessor(records);
            boolean isConsistent = processor.checkFirstRecordConsistency();
            System.out.println("Is the first record consistent? " + isConsistent);

            int totalAge = processor.calculateTotalAge();
            System.out.println("Total age of all records: " + totalAge);

            // Create student objects
            List<Student> students = new ArrayList<>();
            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                students.add(new Student(name, age));
            }

            // Print student details
            for (Student student : students) {
                System.out.println(student.getName() + " is " + student.getAge() + " years old.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}