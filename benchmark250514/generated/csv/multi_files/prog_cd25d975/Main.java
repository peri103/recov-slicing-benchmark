import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) throws Exception {
        // Sample CSV data
        String csvData = "Name,Age,City\nJohn,30,New York\nJane,25,Los Angeles";

        // Initialize CSVHandler and parse data
        CSVHandler csvHandler = new CSVHandler();
        List<CSVRecord> records = csvHandler.parseCSV(csvData);

        // Initialize StudentManager
        StudentManager studentManager = new StudentManager();

        // Add students from CSV data
        for (CSVRecord record : records) {
            String name = record.get("Name");
            int age = Integer.parseInt(record.get("Age"));
            String city = record.get("City");
            Student student = new Student(name, age, city);
            studentManager.addStudent(student);
        }

        // Process student data
        Map<String, Integer> ageMap = new HashMap<>();
        for (Student student : studentManager.getStudents()) {
            ageMap.put(student.getName(), student.getAge());
        }

        // Calculate average age
        int totalAge = 0;
        for (int age : ageMap.values()) {
            totalAge += age;
        }
        double averageAge = totalAge / (double) ageMap.size();
        System.out.println("Average Age: " + averageAge);

        // Access the first record
        CSVRecord firstRecord = records.get(0);

        // Check if a specific header is mapped
        /* read */ boolean isMapped = firstRecord.isMapped("Name");
        
        // Output the result
        System.out.println("Is 'Name' mapped: " + isMapped);

        // Output city information
        for (Student student : studentManager.getStudents()) {
            System.out.println(student.getName() + " lives in " + student.getCity());
        }
    }
}