import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a DateModifier instance
        Date currentDate = new Date();
        DateModifier dateModifier = new DateModifier(currentDate);
        
        // Set the year of the date
        dateModifier.setYear(2023);

        // Create a Course and add Students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print the students in the course
        List<Student> students = course.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Use DateTruncator to truncate the date
        DateTruncator dateTruncator = new DateTruncator();
        Date truncatedDate = dateTruncator.truncateDate(dateModifier.getDate());

        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);

        // Perform more unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}