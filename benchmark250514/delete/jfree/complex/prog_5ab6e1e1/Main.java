import org.jfree.chart.renderer.xy.XYShapeRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        XYShapeRenderer shapeRenderer = new XYShapeRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        
        /* write */ shapeRenderer.setOutlinePaint(Color.RED);
        
        lineRenderer.setSeriesPaint(0, Color.BLUE);
        lineRenderer.setSeriesShapesVisible(0, true);
        
        List<XYShapeRenderer> renderers = new ArrayList<>();
        renderers.add(shapeRenderer);
        renderers.add(new XYShapeRenderer());
        
        for (XYShapeRenderer renderer : renderers) {
            renderer.setOutlinePaint(Color.GREEN);
        }
        
        Paint outlinePaint = lineRenderer.getSeriesPaint(0);
        System.out.println("Line Renderer Series Paint: " + outlinePaint);
        
        // Additional logic to make the program more complex
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration: " + i);
        }
        
        /* read */ Paint finalOutlinePaint = shapeRenderer.getOutlinePaint();
        System.out.println("Shape Renderer Outline Paint: " + finalOutlinePaint);
        
        // More complex logic
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);
    }
}