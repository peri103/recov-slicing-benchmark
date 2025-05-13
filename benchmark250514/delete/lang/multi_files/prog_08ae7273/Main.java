import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        // Initialize the date operation
        Date date = new Date();
        DateOperations dateOperations = new DateOperations(date);
        dateOperations.setSeconds(45);

        // Initialize the date truncator
        DateTruncator dateTruncator = new DateTruncator();
        Date truncatedDate = dateTruncator.truncateSeconds(dateOperations.getDate());

        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);

        // Create a new course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print out the students in the course
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}