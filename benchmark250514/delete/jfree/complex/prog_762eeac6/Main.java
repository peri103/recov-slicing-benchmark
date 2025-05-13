import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();

        // Set shapes visible for series in XYStepAreaRenderer
        /* write */ renderer.setSeriesShapesVisible(0, true);

        // Additional operations with XYLineAndShapeRenderer
        lineRenderer.setSeriesShapesVisible(1, false);
        boolean lineVisible = lineRenderer.getSeriesShapesVisible(1);
        System.out.println("Line renderer series 1 shapes visible: " + lineVisible);

        // Perform other unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Check visibility for XYStepAreaRenderer
        /* read */ Boolean isVisible = renderer.getSeriesShapesVisible(0);
        System.out.println("Step area renderer series 0 shapes visible: " + isVisible);

        // Further unrelated calculations
        double product = 1.0;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}