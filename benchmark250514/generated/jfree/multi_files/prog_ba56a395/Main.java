import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Stroke;
import java.awt.BasicStroke;

public class Main {
    public static void main(String[] args) {
        RendererManager rendererManager = new RendererManager();
        rendererManager.configureRenderer();
        
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        student1.addGrade(85);
        student2.addGrade(90);
        
        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);
        
        for (Student student : mathCourse.getStudents()) {
            System.out.println(student.getName() + "'s grades: " + student.getGrades());
        }
        
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        Stroke lineStroke = new BasicStroke(1.0f);
        lineRenderer.setSeriesShapesVisible(0, true);
        lineRenderer.setSeriesStroke(0, lineStroke);
        
        for (int i = 0; i < 3; i++) {
            Stroke tempStroke = lineRenderer.getSeriesStroke(i);
            System.out.println("Retrieved Line Stroke for series " + i + ": " + tempStroke);
        }
        
        /* read */ Stroke retrievedStroke = rendererManager.getRendererStroke();
        System.out.println("Retrieved Renderer Stroke: " + retrievedStroke);
    }
}