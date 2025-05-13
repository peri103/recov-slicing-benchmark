import org.jfree.data.time.Day;
import org.jfree.data.time.RegularTimePeriod;

public class Main {
    public static void main(String[] args) {
        // Initialize TimePeriodManager and set the first period
        TimePeriodManager timePeriodManager = new TimePeriodManager("Academic Year");
        RegularTimePeriod startPeriod = new Day(1, 1, 2023);
        timePeriodManager.setFirstPeriod(startPeriod);

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Print course and students
        System.out.println(course);

        // Retrieve the first period using the read method
        /* read */ RegularTimePeriod firstPeriod = timePeriodManager.getFirstPeriod();
        System.out.println("First period of the academic year: " + firstPeriod);
    }
}