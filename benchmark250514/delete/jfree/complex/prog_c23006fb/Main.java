import org.jfree.chart.renderer.xy.XYBubbleRenderer;
import org.jfree.chart.renderer.xy.XYBubbleRenderer.ScaleType;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYBubbleRenderer bubbleRenderer = new XYBubbleRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();

        // Setting scale type for the bubble renderer
        /* write */ bubbleRenderer.setScaleType(ScaleType.LINEAR);
        
        // Complex operations with line renderer
        lineRenderer.setSeriesShapesVisible(0, true);
        lineRenderer.setSeriesLinesVisible(0, false);
        lineRenderer.setSeriesShapesFilled(0, true);
        
        // More operations on bubble renderer
        ScaleType[] scaleTypes = ScaleType.values();
        for (ScaleType type : scaleTypes) {
            if (type != ScaleType.LINEAR) {
                bubbleRenderer.setScaleType(type);
            }
        }
        
        // Reading the scale type after other operations
        /* read */ ScaleType scaleType = bubbleRenderer.getScaleType();
        System.out.println("Bubble Renderer Scale Type: " + scaleType);

        // Additional complex logic
        for (int i = 0; i < scaleTypes.length; i++) {
            bubbleRenderer.setScaleType(scaleTypes[i]);
            System.out.println("Setting Scale Type to: " + scaleTypes[i]);
        }
        
        // Final output of the scale type
        ScaleType finalScaleType = bubbleRenderer.getScaleType();
        System.out.println("Final Bubble Renderer Scale Type: " + finalScaleType);
    }
}