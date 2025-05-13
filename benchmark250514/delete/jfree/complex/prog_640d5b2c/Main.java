import org.jfree.chart.renderer.xy.XYShapeRenderer;
import java.awt.Color;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYShapeRenderer renderer = new XYShapeRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        
        // Set some properties for lineRenderer
        lineRenderer.setBaseShapesVisible(true);
        lineRenderer.setBaseLinesVisible(false);
        lineRenderer.setSeriesPaint(0, Color.BLUE);

        // Perform a series of operations
        Color initialColor = Color.GREEN;
        for (int i = 0; i < 3; i++) {
            // Change the outline paint based on iteration
            if (i % 2 == 0) {
                initialColor = Color.YELLOW;
            } else {
                initialColor = Color.MAGENTA;
            }
            renderer.setOutlinePaint(initialColor);
        }
        
        /* write */ renderer.setOutlinePaint(Color.RED);

        // More operations
        Color[] colors = {Color.CYAN, Color.ORANGE, Color.PINK};
        for (Color color : colors) {
            lineRenderer.setSeriesPaint(1, color);
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // Retrieve the outline paint
        /* read */ Color outlinePaint = (Color) renderer.getOutlinePaint();
        System.out.println("Outline Paint: " + outlinePaint);

        // Additional operations
        lineRenderer.setSeriesShapesFilled(2, true);
        lineRenderer.setSeriesLinesVisible(2, true);
        lineRenderer.setSeriesPaint(2, Color.GRAY);
    }
}