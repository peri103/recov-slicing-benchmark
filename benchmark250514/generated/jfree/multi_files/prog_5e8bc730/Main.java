import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LineAndShapeRenderer lineRenderer = new LineAndShapeRenderer();
        
        // Initialize a course and students
        Course course = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        
        // Enroll students in the course
        course.enrollStudent(alice);
        course.enrollStudent(bob);
        
        // Add scores to students
        alice.addScore(85);
        bob.addScore(90);
        
        // Perform some unrelated operations
        BarRenderer barRenderer = new BarRenderer();
        barRenderer.setSeriesVisibleInLegend(0, true);
        
        // Change visibility of series shapes
        lineRenderer.setSeriesShapesVisible(0, false);
        
        // Read scores from a student
        List<Integer> aliceScores = alice.getScores().getScores();
        /* read */ int aliceFirstScore = aliceScores.get(0);
        
        System.out.println("Alice's first score: " + aliceFirstScore);
        
        // Further unrelated operations
        boolean legendVisibility = barRenderer.getSeriesVisibleInLegend(0);
        System.out.println("Series legend visibility: " + legendVisibility);
    }
}