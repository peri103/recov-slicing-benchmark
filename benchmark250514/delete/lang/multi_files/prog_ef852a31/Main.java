import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Student student = new Student("John Doe", currentDate);

        // Manipulate the student's enrollment date
        student.addWeeksToEnrollmentDate(2);

        // Get the updated enrollment date
        Date updatedDate = student.getEnrollmentDate();

        // Truncate the updated date
        DateTruncator truncator = new DateTruncator();
        Date truncatedDate = truncator.truncateDate(updatedDate);

        // Output the truncated date
        System.out.println("Truncated Enrollment Date: " + truncatedDate);
    }
}