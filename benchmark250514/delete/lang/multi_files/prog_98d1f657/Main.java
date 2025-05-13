import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a DateManipulator object with the current date
        Date now = new Date();
        DateManipulator dateManipulator = new DateManipulator(now);

        // Add 10 seconds to the current date
        dateManipulator.addSecondsToDate(10);

        // Create a DateTruncator object
        DateTruncator dateTruncator = new DateTruncator();

        // Truncate the futureDate to remove seconds
        Date truncatedDate = dateTruncator.truncateDate(dateManipulator.getDate());

        // Print the truncatedDate
        System.out.println("Truncated date (seconds removed): " + truncatedDate);

        // Create a student and enroll in courses
        Student student = new Student("Alice");
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 4);
        
        student.enrollInCourse(math);
        student.enrollInCourse(science);

        // Print student courses
        for (Course course : student.getCourses()) {
            System.out.println("Course: " + course.getCourseName() + ", Credits: " + course.getCredits());
        }
    }
}