import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        DateOperations dateOperations = new DateOperations(date);
        DateTruncator dateTruncator = new DateTruncator();

        // Use the write method
        Date updatedDate = dateOperations.setMinutes(30);

        // Additional unrelated operations
        Student student = new Student("John Doe");
        Course mathCourse = new Course("Mathematics");
        student.enrollCourse(mathCourse);
        mathCourse.addStudent(student);

        for (Course course : student.getCourses()) {
            System.out.println("Student is enrolled in: " + course.title);
        }

        // Use the read method
        Date truncatedDate = dateTruncator.truncateToMinute(updatedDate);

        System.out.println("Truncated Date: " + truncatedDate);
    }
}