import org.jfree.chart.renderer.xy.XYBubbleRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYBubbleRenderer renderer = new XYBubbleRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        
        /* write */ renderer.setScaleType(XYBubbleRenderer.SCALE_ON_BOTH_AXES);
        
        // Using another renderer to add complexity
        lineRenderer.setSeriesLinesVisible(0, true);
        lineRenderer.setBaseShapesVisible(true);
        
        // Some unrelated operations
        int[] data = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        System.out.println("Sum of data: " + sum);
        
        // More operations using lineRenderer
        lineRenderer.setSeriesPaint(1, java.awt.Color.BLUE);
        lineRenderer.setSeriesStroke(1, new java.awt.BasicStroke(2.0f));
        
        /* read */ int scaleType = renderer.getScaleType();
        System.out.println("Scale Type: " + scaleType);
        
        // Further operations to increase complexity
        boolean isVisible = lineRenderer.getSeriesLinesVisible(0);
        System.out.println("Series line visible: " + isVisible);
    }
}