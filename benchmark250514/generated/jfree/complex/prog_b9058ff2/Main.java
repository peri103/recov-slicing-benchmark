import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        
        /* write */ renderer.setSeriesStroke(0, stroke);
        
        // Additional code to make the program more complex
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        lineRenderer.setSeriesPaint(0, Color.BLUE);
        lineRenderer.setSeriesStroke(0, new BasicStroke(1.0f));
        
        Stroke anotherStroke = new BasicStroke(3.0f);
        lineRenderer.setSeriesStroke(1, anotherStroke);
        Stroke retrievedAnotherStroke = lineRenderer.getSeriesStroke(1);
        
        Color color = (Color) lineRenderer.getSeriesPaint(0);
        System.out.println("Series 0 Color: " + color.toString());
        System.out.println("Series 1 Stroke equals: " + anotherStroke.equals(retrievedAnotherStroke));
        
        // More unrelated code
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        /* read */ Stroke retrievedStroke = renderer.getSeriesStroke(0);
        
        System.out.println("Original Stroke equals: " + retrievedStroke.equals(stroke)); // Should print true
    }
}