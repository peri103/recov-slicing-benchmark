import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a RangeMapHandler instance
        RangeMapHandler rangeMapHandler = new RangeMapHandler();

        // Add ranges to the RangeMapHandler
        rangeMapHandler.addRange(Range.closed(1, 10), "Hello");
        rangeMapHandler.addRange(Range.closed(11, 20), "World");
        
        // Create a Student instance
        Student student = new Student("Alice", 20, "Computer Science");
        
        // Create a Course instance and enroll the student
        Course course = new Course("Data Structures");
        course.enrollStudent(student);
        
        // Print enrolled students
        for (Student enrolledStudent : course.getEnrolledStudents()) {
            System.out.println("Student Name: " + enrolledStudent.getName());
            System.out.println("Student Age: " + enrolledStudent.getAge());
            System.out.println("Student Major: " + enrolledStudent.getMajor());
        }

        // Read a value from the RangeMapHandler
        /* read */ String value = rangeMapHandler.getValue(5);
        
        System.out.println("Value from RangeMap: " + value);
    }
}