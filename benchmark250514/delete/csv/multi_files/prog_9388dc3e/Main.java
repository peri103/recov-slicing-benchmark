import java.util.HashMap;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name, Age, Location\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";
        
        // Process CSV data
        CSVProcessor processor = new CSVProcessor(csvData);
        HashMap<String, Student> students = Student.createStudents(processor.getRecords());

        // Access a specific student
        Student john = students.get("John Doe");
        System.out.println("Name: " + john.getName() + ", Age: " + john.getAge() + ", Location: " + john.getLocation());

        // Check if a specific column is mapped
        CSVRecord firstRecord = processor.getRecords().get(0);
        /* read */ boolean isMapped = firstRecord.isMapped("Name");
        System.out.println("Is 'Name' column mapped: " + isMapped);
    }
}