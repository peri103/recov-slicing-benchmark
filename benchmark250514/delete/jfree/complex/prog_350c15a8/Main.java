import org.jfree.chart.renderer.xy.XYShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.awt.BasicStroke;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYShapeRenderer shapeRenderer = new XYShapeRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        
        Paint paint = Color.RED;
        Paint linePaint = Color.BLUE;
        
        // Set outline paint for shape renderer
        /* write */ shapeRenderer.setOutlinePaint(paint);
        
        // Set some properties for line renderer
        lineRenderer.setSeriesPaint(0, linePaint);
        lineRenderer.setSeriesStroke(0, new BasicStroke(2.0f));
        
        // Perform operations with lineRenderer
        Paint seriesPaint = lineRenderer.getSeriesPaint(0);
        System.out.println("Line Renderer Series Paint: " + seriesPaint);
        
        // Complex operations with shapeRenderer
        for (int i = 0; i < 5; i++) {
            shapeRenderer.setSeriesOutlineStroke(i, new BasicStroke(i + 1.0f));
        }
        
        // Retrieve and print outline paint for shape renderer
        /* read */ Paint outlinePaint = shapeRenderer.getOutlinePaint();
        System.out.println("Shape Renderer Outline Paint: " + outlinePaint);
        
        // Additional operations
        for (int i = 0; i < 3; i++) {
            lineRenderer.setSeriesShapesVisible(i, i % 2 == 0);
            System.out.println("Line Renderer Series " + i + " Shapes Visible: " + lineRenderer.getSeriesShapesVisible(i));
        }
    }
}