import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Use DateManager to set the week
        DateManager dateManager = new DateManager(2023, Calendar.OCTOBER, 1);
        dateManager.setWeek(5);
        Date date = dateManager.getDate();

        // Process the date using DateProcessor
        DateProcessor dateProcessor = new DateProcessor(date);
        Date truncatedDate = dateProcessor.truncateToWeek();

        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);

        // Create a student and enroll in courses
        Student student = new Student("John Doe");
        Course course1 = new Course("Mathematics", 3);
        Course course2 = new Course("History", 2);
        student.enrollCourse(course1);
        student.enrollCourse(course2);

        // Print student's courses
        for (Course course : student.getCourses()) {
            System.out.println("Course: " + course.getCourseName() + ", Credits: " + course.getCredits());
        }
    }
}