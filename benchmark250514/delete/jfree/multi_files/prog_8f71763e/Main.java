import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create a PlotManager instance
        PlotManager plotManager = new PlotManager();
        
        // Set plot background
        plotManager.setPlotBackground(Color.BLUE);

        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 101));
        course.addStudent(new Student("Bob", 102));

        // Print student details
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getStudentId());
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Retrieve and print the plot background paint
        /* read */ Paint backgroundPaint = plotManager.getPlotBackground();
        System.out.println("Background paint: " + backgroundPaint);
    }
}