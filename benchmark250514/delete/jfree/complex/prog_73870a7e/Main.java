import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        
        // Initialize Paint objects
        Paint stepPaint = Color.RED;
        Paint linePaint = Color.BLUE;
        
        // Set range paint for step area renderer
        /* write */ stepAreaRenderer.setRangePaint(stepPaint);
        
        // Set paint for line renderer
        lineRenderer.setSeriesPaint(0, linePaint);
        
        // Perform operations on line renderer
        lineRenderer.setSeriesShapesVisible(0, true);
        lineRenderer.setSeriesLinesVisible(0, true);
        
        // Create an ArrayList to hold Paint objects
        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(stepPaint);
        paintList.add(linePaint);
        
        // Iterate over paintList and print the colors
        for (Paint paint : paintList) {
            System.out.println(paint);
        }
        
        // Read range paint from step area renderer
        /* read */ Paint readPaint = stepAreaRenderer.getRangePaint();
        
        System.out.println("Read paint from step area renderer: " + readPaint);
        
        // Additional operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Create another renderer and set its paint
        XYStepAreaRenderer anotherRenderer = new XYStepAreaRenderer();
        anotherRenderer.setRangePaint(Color.GREEN);
        
        // Print the paint from another renderer
        Paint anotherPaint = anotherRenderer.getRangePaint();
        System.out.println("Paint from another renderer: " + anotherPaint);
    }
}