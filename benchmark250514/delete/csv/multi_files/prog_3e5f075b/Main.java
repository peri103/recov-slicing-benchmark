import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Step 1: Configure CSV Format
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.configureFormat();

        // Step 2: Create a dummy CSVRecord for demonstration purposes
        String[] values = {"value1", "value2"};
        CSVRecord record = new CSVRecord(null, values, null, 0, 0);

        // Step 3: Check CSVRecord consistency
        CSVRecordChecker checker = new CSVRecordChecker(record);
        boolean isConsistent = checker.checkConsistency();
        System.out.println("Is the CSVRecord consistent? " + isConsistent);

        // Step 4: Create students and courses
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Course math = new Course("Math");
        Course science = new Course("Science");

        // Step 5: Enroll students in courses
        math.addStudent(alice);
        science.addStudent(bob);
        alice.enrollCourse(math);
        bob.enrollCourse(science);

        // Step 6: Display student-course information
        for (Student student : math.getStudents()) {
            System.out.println(student.getName() + " is enrolled in " + math.getCourseName());
        }

        for (Student student : science.getStudents()) {
            System.out.println(student.getName() + " is enrolled in " + science.getCourseName());
        }

        // Step 7: Use a HashMap for additional operations
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 90);
        map.put("Bob", 85);

        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of scores: " + sum);
    }
}