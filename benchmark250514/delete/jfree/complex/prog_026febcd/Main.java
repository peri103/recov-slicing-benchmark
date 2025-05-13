import org.jfree.chart.renderer.xy.XYShapeRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYShapeRenderer shapeRenderer = new XYShapeRenderer();
        
        // Additional Renderer for complexity
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        lineRenderer.setSeriesPaint(0, Color.BLUE);
        
        /* write */ shapeRenderer.setOutlinePaint(Color.RED);
        
        // Manipulate the lineRenderer
        lineRenderer.setSeriesShapesVisible(0, true);
        lineRenderer.setSeriesLinesVisible(0, false);
        
        // More unrelated operations
        Paint linePaint = lineRenderer.getSeriesPaint(0);
        System.out.println("Line Renderer Paint: " + linePaint);
        
        // Complex loop with condition
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                lineRenderer.setSeriesPaint(i, Color.GREEN);
            } else {
                lineRenderer.setSeriesPaint(i, Color.YELLOW);
            }
        }
        
        // Retrieve the outline paint set earlier
        /* read */ Paint outlinePaint = shapeRenderer.getOutlinePaint();
        System.out.println("Outline Paint: " + outlinePaint);
        
        // Print series paint colors for additional complexity
        for (int i = 0; i < 5; i++) {
            Paint seriesPaint = lineRenderer.getSeriesPaint(i);
            System.out.println("Series " + i + " Paint: " + seriesPaint);
        }
    }
}