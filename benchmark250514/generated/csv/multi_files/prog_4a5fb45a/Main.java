import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";

            // Use CSVHandler to parse CSV data
            CSVHandler csvHandler = new CSVHandler();
            List<CSVRecord> records = csvHandler.parseCSV(csvData);

            // Create a map of students from CSV records
            HashMap<String, Student> studentMap = Student.createStudentMap(records);

            // Perform some unrelated operations to make the program more complex
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i * i;
            }
            System.out.println("Sum of squares from 0 to 9: " + sum);

            // Retrieve and print the first record using the original read method
            /* read */ CSVRecord record = records.get(0);
            System.out.println("First record: " + record.toString());

            // Print the stored student details from the HashMap
            for (String name : studentMap.keySet()) {
                Student student = studentMap.get(name);
                System.out.println(name + ": " + student.getDetails());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}