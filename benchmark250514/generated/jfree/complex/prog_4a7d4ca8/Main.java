import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
        XYLineAndShapeRenderer lineAndShapeRenderer = new XYLineAndShapeRenderer();
        
        Stroke stroke1 = new BasicStroke(2.0f);
        Stroke stroke2 = new BasicStroke(3.0f);

        /* write */ stepAreaRenderer.setSeriesOutlineStroke(0, stroke1);

        lineAndShapeRenderer.setSeriesOutlineStroke(1, stroke2);
        
        ArrayList<Stroke> strokes = new ArrayList<>();
        strokes.add(stroke1);
        strokes.add(stroke2);
        
        for (int i = 0; i < strokes.size(); i++) {
            lineAndShapeRenderer.setSeriesOutlineStroke(i, strokes.get(i));
        }
        
        Stroke stroke3 = new BasicStroke(4.0f);
        lineAndShapeRenderer.setSeriesOutlineStroke(2, stroke3);

        Stroke retrievedStroke1 = lineAndShapeRenderer.getSeriesOutlineStroke(1);
        System.out.println("Line and Shape Renderer Stroke 1: " + retrievedStroke1);

        /* read */ Stroke retrievedStroke2 = stepAreaRenderer.getSeriesOutlineStroke(0);
        System.out.println("Step Area Renderer Stroke: " + retrievedStroke2);

        Stroke retrievedStroke3 = lineAndShapeRenderer.getSeriesOutlineStroke(2);
        System.out.println("Line and Shape Renderer Stroke 2: " + retrievedStroke3);
    }
}