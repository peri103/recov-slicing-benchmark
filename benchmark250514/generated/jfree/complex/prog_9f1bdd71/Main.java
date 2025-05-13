import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        Paint paint = Color.RED;
        Paint linePaint = Color.BLUE;
        
        /* write */ stepAreaRenderer.setSeriesPaint(0, paint);
        
        // Using a HashMap to store series and their paints
        Map<Integer, Paint> seriesPaintMap = new HashMap<>();
        seriesPaintMap.put(0, paint);
        seriesPaintMap.put(1, linePaint);
        
        // Setting paint for lineRenderer series
        for (Map.Entry<Integer, Paint> entry : seriesPaintMap.entrySet()) {
            lineRenderer.setSeriesPaint(entry.getKey(), entry.getValue());
        }
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Retrieve paint using stepAreaRenderer
        /* read */ Paint retrievedPaint = stepAreaRenderer.getSeriesPaint(0);
        System.out.println("Retrieved Paint from StepAreaRenderer: " + retrievedPaint);
        
        // Retrieve paint using lineRenderer
        Paint retrievedLinePaint = lineRenderer.getSeriesPaint(1);
        System.out.println("Retrieved Paint from LineRenderer: " + retrievedLinePaint);
        
        // Further operations with the retrieved paints
        if (retrievedPaint.equals(Color.RED)) {
            System.out.println("The paint for series 0 is correctly set to RED.");
        }
        
        if (retrievedLinePaint.equals(Color.BLUE)) {
            System.out.println("The paint for series 1 is correctly set to BLUE.");
        }
    }
}