import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create a PolarPlotManager and set its gridline paint
        PolarPlotManager plotManager = new PolarPlotManager();
        plotManager.setGridlinePaint(Color.RED);
        
        // Create a new course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));
        
        // Print out the students in the course
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }
        
        // Retrieve and print the gridline paint from the PolarPlotManager
        /* read */ Paint readPaint = plotManager.getGridlinePaint();
        System.out.println("Gridline Paint: " + readPaint);
    }
}