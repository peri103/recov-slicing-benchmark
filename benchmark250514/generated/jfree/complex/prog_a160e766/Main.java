import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        BarRenderer barRenderer = new BarRenderer();

        // Create a Paint object to use for the label shadow
        Paint shadowPaint = new Color(100, 100, 100); // Grey color
        
        /* write */ piePlot.setLabelShadowPaint(shadowPaint);

        // Additional unrelated code to make the program more complex
        List<Paint> paintList = new ArrayList<>();
        paintList.add(new Color(255, 0, 0)); // Red
        paintList.add(new Color(0, 255, 0)); // Green
        paintList.add(new Color(0, 0, 255)); // Blue

        for (Paint paint : paintList) {
            barRenderer.setSeriesPaint(paintList.indexOf(paint), paint);
        }

        Paint firstPaint = paintList.get(0);
        Paint secondPaint = paintList.get(1);

        // Perform some operations with the category plot
        categoryPlot.setRenderer(barRenderer);
        categoryPlot.setBackgroundPaint(firstPaint);

        Paint backgroundPaint = categoryPlot.getBackgroundPaint();
        System.out.println("Category Plot Background Paint: " + backgroundPaint);

        // More operations unrelated to the original write-read pair
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        /* read */ Paint readShadowPaint = piePlot.getLabelShadowPaint();
        
        System.out.println("Pie Plot Label Shadow Paint: " + readShadowPaint);
    }
}