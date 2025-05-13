import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StackedXYAreaRenderer stackedRenderer = new StackedXYAreaRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        Paint paint = new Color(255, 0, 0); // Red color
        Paint linePaint = new Color(0, 0, 255); // Blue color
        
        ArrayList<String> colorNames = new ArrayList<>();
        colorNames.add("Red");
        colorNames.add("Blue");
        colorNames.add("Green");
        
        /* write */ stackedRenderer.setSeriesPaint(0, paint);
        
        lineRenderer.setSeriesPaint(0, linePaint);
        System.out.println("Line renderer paint: " + lineRenderer.getSeriesPaint(0));
        
        for (String colorName : colorNames) {
            System.out.println("Color name: " + colorName);
        }
        
        Paint retrievedPaint = stackedRenderer.getSeriesPaint(0);
        /* read */ System.out.println("Stacked renderer paint: " + retrievedPaint);
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}