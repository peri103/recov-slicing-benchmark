import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Use the StrBuilderWrapper
        StrBuilderWrapper strWrapper = new StrBuilderWrapper();
        strWrapper.appendText("Hello, World!");
        strWrapper.appendText(" This is a test.");

        // Create a Student and enroll in courses
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);
        student.enrollCourse(math);
        student.enrollCourse(science);

        // Output student's courses
        List<Course> courses = student.getCourses();
        for (Course course : courses) {
            System.out.println("Enrolled in: " + course.getCourseName() + " for " + course.getCredits() + " credits.");
        }

        // Truncate the StrBuilder content
        strWrapper.truncate(5);

        // Final output from StrBuilderWrapper
        /* read */ String truncatedText = strWrapper.getText();
        System.out.println("Truncated text: " + truncatedText);
    }
}