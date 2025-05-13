import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        XYStepRenderer renderer = new XYStepRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();

        /* write */ renderer.setBaseShapesVisible(true);

        // Additional code to make the program complex
        Map<String, Boolean> visibilityMap = new HashMap<>();
        visibilityMap.put("stepRenderer", renderer.getBaseShapesVisible());
        visibilityMap.put("lineRenderer", lineRenderer.getBaseShapesVisible());

        lineRenderer.setBaseShapesVisible(false);
        visibilityMap.put("lineRenderer", lineRenderer.getBaseShapesVisible());

        int sum = 0;
        for (Map.Entry<String, Boolean> entry : visibilityMap.entrySet()) {
            sum += entry.getValue() ? 1 : 0;
        }

        System.out.println("Sum of visible states: " + sum);

        // More complex operations
        for (int i = 0; i < 5; i++) {
            lineRenderer.setBaseShapesVisible(i % 2 == 0);
            visibilityMap.put("lineRenderer_" + i, lineRenderer.getBaseShapesVisible());
        }

        /* read */ boolean isVisible = renderer.getBaseShapesVisible();
        System.out.println("Step Renderer Base Shapes Visible: " + isVisible);

        int totalVisibleCount = 0;
        for (Boolean visible : visibilityMap.values()) {
            if (visible) totalVisibleCount++;
        }

        System.out.println("Total Visible Count: " + totalVisibleCount);
    }
}