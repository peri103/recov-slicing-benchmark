import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        CategoryAxis categoryAxis = new CategoryAxis("Category");
        NumberAxis numberAxis = new NumberAxis("Value");

        // Setting up the CategoryPlot with some axes
        categoryPlot.setDomainAxis(categoryAxis);
        categoryPlot.setRangeAxis(numberAxis);

        // Configuring the PiePlot
        piePlot.setSectionOutlinesVisible(true);
        piePlot.setSectionOutlinePaint(Color.RED);

        // Write operation for PiePlot
        /* write */ piePlot.setLabelBackgroundPaint(Color.BLUE);

        // Additional configuration for CategoryPlot
        categoryPlot.setBackgroundPaint(Color.LIGHT_GRAY);
        categoryPlot.setOutlinePaint(Color.DARK_GRAY);

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read operation for PiePlot
        /* read */ Paint labelBackgroundPaint = piePlot.getLabelBackgroundPaint();
        System.out.println("Label Background Paint: " + labelBackgroundPaint.toString());

        // More unrelated operations
        double product = 1.0;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Final configuration for CategoryPlot
        categoryPlot.setDomainGridlinesVisible(true);
        categoryPlot.setRangeGridlinesVisible(true);
    }
}