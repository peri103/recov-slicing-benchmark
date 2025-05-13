import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create a PaintManager for a specific axis
        PaintManager paintManager = new PaintManager("Student Performance Axis");

        // Set paints for different categories
        paintManager.setPaintForCategory("Math", Color.BLUE);
        paintManager.setPaintForCategory("Science", Color.GREEN);

        // Create a student
        Student student = new Student("John Doe", 20, "S12345");
        student.printStudentInfo();

        // Some unrelated logic
        int[] scores = {85, 90, 78, 92};
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        System.out.println("Total Score: " + totalScore);

        // Retrieve and print paint for a specific category
        /* read */ Paint mathPaint = paintManager.getPaintForCategory("Math");
        System.out.println("Paint for Math: " + mathPaint);
    }
}