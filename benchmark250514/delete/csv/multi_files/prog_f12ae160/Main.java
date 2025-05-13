import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age\nJohn,30\nJane,25";

        try {
            CSVHandler csvHandler = new CSVHandler(csvData);
            List<CSVRecord> records = csvHandler.getRecords();

            List<Student> students = new ArrayList<>();
            for (CSVRecord record : records) {
                Student student = new Student(record);
                students.add(student);
            }

            for (Student student : students) {
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            }

            // Additional logic to make the program more complex
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}