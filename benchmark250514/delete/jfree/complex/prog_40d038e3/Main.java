import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYStepAreaRenderer and set a paint color
        XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
        Paint redPaint = new Color(255, 0, 0); // Red color
        
        // Initialize another renderer for demonstration
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        Paint bluePaint = new Color(0, 0, 255); // Blue color
        
        // Set paint for lineRenderer
        lineRenderer.setSeriesPaint(0, bluePaint);
        
        // Use an ArrayList to store renderers
        ArrayList<Object> rendererList = new ArrayList<>();
        rendererList.add(stepAreaRenderer);
        rendererList.add(lineRenderer);
        
        // Manipulate the list
        for (Object renderer : rendererList) {
            if (renderer instanceof XYStepAreaRenderer) {
                /* write */ ((XYStepAreaRenderer) renderer).setRangePaint(redPaint);
            } else if (renderer instanceof XYLineAndShapeRenderer) {
                ((XYLineAndShapeRenderer) renderer).setSeriesPaint(1, new Color(0, 255, 0)); // Green color
            }
        }
        
        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Processing item: " + i);
        }
        
        // Retrieve paint from stepAreaRenderer
        /* read */ Paint readPaint = stepAreaRenderer.getRangePaint();
        
        // Print the retrieved paint
        System.out.println("Read Paint: " + readPaint);
        
        // Further manipulation
        for (Object renderer : rendererList) {
            if (renderer instanceof XYLineAndShapeRenderer) {
                Paint seriesPaint = ((XYLineAndShapeRenderer) renderer).getSeriesPaint(0);
                System.out.println("Series Paint: " + seriesPaint);
            }
        }
    }
}