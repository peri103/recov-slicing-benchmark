import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.enrollCourse("Math");
        student.enrollCourse("Science");
        student.enrollCourse("History");

        List<String> courses = student.getCourses();
        for (String course : courses) {
            System.out.println(course);
        }

        // Perform unrelated operations
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += i;
        }
        System.out.println("Total: " + total);

        // Read the count of a specific course
        /* read */ int mathCount = student.getCourseCount("Math");

        // Print the count
        System.out.println("Math course count: " + mathCount);
    }
}