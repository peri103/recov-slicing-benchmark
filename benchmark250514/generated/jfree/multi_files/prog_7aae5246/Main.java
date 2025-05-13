import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;

public class Main {
    public static void main(String[] args) {
        // Setup chart renderer
        ChartRendererManager manager = new ChartRendererManager();
        XYItemRenderer renderer = new StandardXYItemRenderer();
        manager.configureRenderer(renderer);

        // Perform analysis on the chart
        ChartAnalysis analysis = new ChartAnalysis(manager.getPlot());
        XYItemRenderer retrievedRenderer = analysis.analyzeRenderer();
        System.out.println(retrievedRenderer != null ? "Renderer set successfully" : "Renderer not set");

        // Setup course and students
        Course course = new Course("Advanced Mathematics");
        Student alice = new Student("Alice", 101);
        Student bob = new Student("Bob", 102);
        course.addStudent(alice);
        course.addStudent(bob);

        // Display students in the course
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentId());
        }
    }
}