import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        // CSV data initialization
        String csvData = "#This is a comment\nheader1,header2\nvalue1,value2";

        // Create CSVHandler to manage CSV operations
        CSVHandler csvHandler = new CSVHandler(csvData);

        // Create CommentReader to read comments from CSV records
        CommentReader commentReader = new CommentReader(csvHandler.getRecords());

        // Read and print the first comment
        String comment = commentReader.getFirstComment();
        System.out.println("Comment: " + comment);

        // Additional complex logic
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("Alice", new Student("Alice", 20));
        studentMap.put("Bob", new Student("Bob", 22));

        for (String key : studentMap.keySet()) {
            Student student = studentMap.get(key);
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Complex calculation
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}