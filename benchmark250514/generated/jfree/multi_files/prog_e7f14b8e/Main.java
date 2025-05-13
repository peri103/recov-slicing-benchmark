import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize chart utilities
        ChartUtils chartUtils = new ChartUtils();
        chartUtils.initializeRenderer();

        // Create a course and add students
        Course course = new Course("Advanced Java");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Display course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentId());
        }

        // Retrieve and print series outline paint from ChartUtils
        /* read */ Paint paint = chartUtils.getOutlinePaint(0);
        System.out.println("Series 0 outline paint: " + paint);
    }
}