import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        DateManipulator dateManipulator = new DateManipulator(currentDate);

        // Manipulate date
        dateManipulator.addHoursToCurrentDate(5);

        // Create a course and add students
        Course course = new Course("Advanced Programming");
        course.addStudent(new Student("Alice", 101));
        course.addStudent(new Student("Bob", 102));

        // Output student information
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Get and print truncated date
        /* read */ Date truncatedDate = dateManipulator.getTruncatedDate();
        System.out.println("Truncated Date: " + truncatedDate);
    }
}