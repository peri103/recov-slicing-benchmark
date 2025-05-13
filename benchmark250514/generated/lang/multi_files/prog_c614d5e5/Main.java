import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Date: " + dateFormat.format(currentDate));

        DateHandler dateHandler = new DateHandler(currentDate);
        dateHandler.setHour(10);

        DateTruncator dateTruncator = new DateTruncator();
        Date truncatedDate = dateTruncator.truncateDate(dateHandler.getDate());
        System.out.println("Truncated Date: " + dateFormat.format(truncatedDate));

        Student student = new Student("John Doe");
        student.enroll("Mathematics");
        student.enroll("Science");

        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getCourses());

        Course course = new Course("History", 3);
        System.out.println("Course Title: " + course.getTitle());
        System.out.println("Course Credits: " + course.getCredits());
    }
}