import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a new course
        Course course = new Course("Computer Science");

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add grades to students
        alice.addGrade(90);
        bob.addGrade(85);

        // Add students to the course
        course.addStudent(alice);
        course.addStudent(bob);

        // Create a MultimapWrapper instance
        MultimapWrapper multimapWrapper = new MultimapWrapper();

        // Add an entry to the multimap
        multimapWrapper.addEntry("key", 42);

        // Perform some unrelated operations
        Map<String, Integer> map = new HashMap<>();
        map.put("extraKey", 100);
        int extraValue = map.get("extraKey");
        System.out.println("Extra value: " + extraValue);

        // Access the value from the multimap
        /* read */ Integer value = multimapWrapper.getFirstValue("key");
        System.out.println("Value from multimap: " + value);

        // Print student names and grades
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }
    }
}