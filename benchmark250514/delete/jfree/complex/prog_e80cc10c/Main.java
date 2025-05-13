import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PolarPlot polarPlot = new PolarPlot();
        Paint anglePaint = Color.RED;
        
        /* write */ polarPlot.setAngleGridlinePaint(anglePaint);

        // Adding complexity by using another plot
        SpiderWebPlot spiderWebPlot = new SpiderWebPlot(new ArrayList());
        Paint webPaint = Color.BLUE;
        spiderWebPlot.setSeriesPaint(0, webPaint);

        // Perform some additional operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Further operations
        Paint anotherPaint = Color.GREEN;
        spiderWebPlot.setSeriesPaint(1, anotherPaint);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        // Retrieve the angle gridline paint
        /* read */ Paint retrievedPaint = polarPlot.getAngleGridlinePaint();
        
        System.out.println("Retrieved Paint: " + retrievedPaint);
    }
}