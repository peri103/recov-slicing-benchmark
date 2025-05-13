import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        ChartRenderer chartRenderer = new ChartRenderer();
        Paint outlinePaint = Color.RED;
        
        chartRenderer.setBarOutlinePaint(outlinePaint);
        
        // Create a student and add grades
        Student student = new Student("Alice");
        student.addGrade(95);
        student.addGrade(85);
        
        // Print student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Grades: " + student.getGrades());
        
        // Retrieve and print the outline paint of the bar
        /* read */ Paint retrievedPaint = chartRenderer.getBarOutlinePaint();
        System.out.println("Retrieved Bar Outline Paint: " + retrievedPaint);
    }
}