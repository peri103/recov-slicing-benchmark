import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Initialize StrokeManager
        StrokeManager strokeManager = new StrokeManager();
        Stroke anotherStroke = new BasicStroke(3.0f);
        strokeManager.addStroke("AnotherSectionKey", anotherStroke);

        // Perform operations with Student
        double[] scores = {85.0, 92.5, 78.0, 88.5};
        Student student = new Student("John Doe", scores);

        double average = student.calculateAverage();
        System.out.println("Average Score: " + average);

        int countAboveThreshold = student.countAboveThreshold(80.0);
        System.out.println("Scores above 80: " + countAboveThreshold);

        // Retrieve the stroke for the original section key
        /* read */ Stroke retrievedStroke = strokeManager.getStroke("SectionKey");
        System.out.println("Retrieved Stroke: " + retrievedStroke);
    }
}