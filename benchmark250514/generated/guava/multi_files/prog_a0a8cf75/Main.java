import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create students and a course
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        Course course = new Course("Computer Science");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Display enrolled students
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Use the ImmutableMapHandler
        ImmutableMapHandler handler = new ImmutableMapHandler();
        handler.buildMap();

        // Some unrelated complex operations
        Map<String, Integer> stringToIntegerMap = new HashMap<>();
        stringToIntegerMap.put("X", 5);
        stringToIntegerMap.put("Y", 10);
        stringToIntegerMap.put("Z", 15);

        int sum = 0;
        for (Integer val : stringToIntegerMap.values()) {
            sum += val;
        }
        System.out.println("Sum of values: " + sum);

        // Retrieve and print the string instance from the map
        String value = handler.getStringInstance();
        System.out.println(value);
    }
}