import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        BarRenderer renderer = new BarRenderer();

        // Set and get background paint for PiePlot
        /* write */ plot.setBackgroundPaint(Color.BLUE);
        
        // Additional operations
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(i * i);
        }
        
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        System.out.println("Sum of squares: " + sum);

        // Use CategoryPlot and BarRenderer
        categoryPlot.setRenderer(renderer);
        renderer.setSeriesPaint(0, Color.GREEN);
        Paint seriesPaint = renderer.getSeriesPaint(0);
        System.out.println("Series paint color: " + seriesPaint);

        // Retrieve background paint for PiePlot
        /* read */ Paint backgroundPaint = plot.getBackgroundPaint();
        System.out.println("PiePlot background paint: " + backgroundPaint);

        // More operations
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) % 2 == 0) {
                System.out.println("Even square: " + data.get(i));
            }
        }
    }
}