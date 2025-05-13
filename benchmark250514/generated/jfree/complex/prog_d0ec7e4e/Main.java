import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot and set background paint
        PiePlot piePlot = new PiePlot();
        /* write */ piePlot.setBackgroundPaint(Color.BLUE);

        // Initialize CategoryPlot and set background paint
        CategoryPlot categoryPlot = new CategoryPlot();
        categoryPlot.setBackgroundPaint(Color.RED);

        // Initialize XYPlot and set background paint
        XYPlot xyPlot = new XYPlot();
        xyPlot.setBackgroundPaint(Color.GREEN);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Use CategoryPlot's background paint
        Paint categoryBackgroundPaint = categoryPlot.getBackgroundPaint();
        System.out.println("CategoryPlot Background Paint: " + categoryBackgroundPaint);

        // Perform some more unrelated operations
        double product = 1.0;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Use XYPlot's background paint
        Paint xyBackgroundPaint = xyPlot.getBackgroundPaint();
        System.out.println("XYPlot Background Paint: " + xyBackgroundPaint);

        // Finally, read the background paint from PiePlot
        /* read */ Paint pieBackgroundPaint = piePlot.getBackgroundPaint();
        System.out.println("PiePlot Background Paint: " + pieBackgroundPaint);
    }
}