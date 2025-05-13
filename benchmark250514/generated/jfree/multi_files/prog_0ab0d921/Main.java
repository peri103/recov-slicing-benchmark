import org.jfree.chart.plot.PiePlot;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Stroke stroke = new BasicStroke(2.0f);

        StrokeManager strokeManager = new StrokeManager(plot);
        StrokeRetriever strokeRetriever = new StrokeRetriever(plot);

        strokeManager.setStrokeForSection("Section 1", stroke);

        // Unrelated code to make the program more complex
        Course course = new Course("Mathematics");
        course.enrollStudent("John Doe");
        course.enrollStudent("Jane Smith");

        System.out.println("Course: " + course.getCourseName());
        for (String student : course.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + student);
        }

        Stroke retrievedStroke = strokeRetriever.getStrokeForSection("Section 1");
        System.out.println("Retrieved stroke equals original: " + retrievedStroke.equals(stroke));
    }
}