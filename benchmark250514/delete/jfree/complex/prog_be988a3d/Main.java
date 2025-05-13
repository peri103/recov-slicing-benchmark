import org.jfree.chart.renderer.xy.XYBubbleRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYBubbleRenderer bubbleRenderer = new XYBubbleRenderer();
        
        ArrayList<Integer> scaleTypes = new ArrayList<>();
        scaleTypes.add(XYBubbleRenderer.SCALE_ON_DOMAIN_AXIS);
        scaleTypes.add(XYBubbleRenderer.SCALE_ON_RANGE_AXIS);
        
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        lineRenderer.setSeriesShapesVisible(0, true);
        lineRenderer.setSeriesLinesVisible(0, false);
        
        /* write */ bubbleRenderer.setScaleType(scaleTypes.get(1));
        
        int sum = 0;
        for (int i = 0; i < scaleTypes.size(); i++) {
            sum += scaleTypes.get(i);
        }
        
        /* read */ int scaleType = bubbleRenderer.getScaleType();
        System.out.println("Scale Type: " + scaleType);
        
        for (int i = 0; i < scaleTypes.size(); i++) {
            System.out.println("Scale Type from list: " + scaleTypes.get(i));
        }
        
        System.out.println("Sum of scale types: " + sum);
        
        if (lineRenderer.getSeriesShapesVisible(0)) {
            System.out.println("Shapes are visible for series 0.");
        }
        
        if (!lineRenderer.getSeriesLinesVisible(0)) {
            System.out.println("Lines are not visible for series 0.");
        }
    }
}