import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize DateManipulator and set seconds
        DateManipulator dateManipulator = new DateManipulator();
        dateManipulator.setSeconds(45);

        // Initialize DateTruncator and truncate the date
        DateTruncator dateTruncator = new DateTruncator();
        Date truncatedDate = dateTruncator.truncateToSeconds(dateManipulator.getDate());
        System.out.println("Truncated Date: " + truncatedDate);

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        course.addStudent(student1);
        course.addStudent(student2);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Perform additional date manipulation
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(truncatedDate);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();
        System.out.println("Future Date (5 days later): " + futureDate);
    }
}