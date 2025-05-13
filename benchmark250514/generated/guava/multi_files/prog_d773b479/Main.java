import java.util.Collection;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a student and add grades
        Student student = new Student("John Doe");
        student.addGrade("Math", 90);
        student.addGrade("Science", 85);

        // Print student's grades
        for (Map.Entry<String, Integer> entry : student.getGrades().entrySet()) {
            System.out.println("Course: " + entry.getKey() + ", Grade: " + entry.getValue());
        }

        // Create a course and enroll students
        Course course = new Course("Physics");
        course.enrollStudent("John Doe");
        course.enrollStudent("Jane Smith");

        // Print enrolled students
        System.out.println("Enrolled students in " + course.getCourseName() + ":");
        for (String studentName : course.getEnrolledStudents()) {
            System.out.println(studentName);
        }

        // Use ForwardingMultimapWrapper to add and retrieve values
        ForwardingMultimapWrapper multimapWrapper = new ForwardingMultimapWrapper();
        multimapWrapper.addEntry("key1", "value1");
        multimapWrapper.addEntry("key1", "value2");

        // Perform some operations before the read
        int totalGrades = 0;
        for (int grade : student.getGrades().values()) {
            totalGrades += grade;
        }
        System.out.println("Total grades sum: " + totalGrades);

        // Read from the multimap
        /* read */ Collection<String> values = multimapWrapper.getValues("key1");
        for (String value : values) {
            System.out.println("Value from multimap: " + value);
        }

        // Additional operations after read
        int averageGrade = totalGrades / student.getGrades().size();
        System.out.println("Average grade: " + averageGrade);
    }
}