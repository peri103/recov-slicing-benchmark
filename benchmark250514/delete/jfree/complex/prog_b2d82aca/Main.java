import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create a custom plot
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };

        // Create a dataset
        XYSeries series = new XYSeries("Data");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.sin(i));
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create axes and renderer
        NumberAxis xAxis = new NumberAxis("X-Axis");
        NumberAxis yAxis = new NumberAxis("Y-Axis");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        // Create an XYPlot with the dataset, axes, and renderer
        XYPlot xyPlot = new XYPlot(dataset, xAxis, yAxis, renderer);

        // Set background paint for the custom plot
        /* write */ plot.setBackgroundPaint(Color.BLUE);

        // Modify some properties of the xyPlot
        xyPlot.setDomainGridlinePaint(Color.GRAY);
        xyPlot.setRangeGridlinePaint(Color.GRAY);

        // Perform some calculations and updates
        double sum = 0;
        for (int i = 0; i < series.getItemCount(); i++) {
            sum += series.getY(i).doubleValue();
        }
        System.out.println("Sum of Y values: " + sum);

        // Retrieve the background paint
        /* read */ Paint backgroundPaint = plot.getBackgroundPaint();

        // Output the background color and plot type
        System.out.println("Background Paint: " + backgroundPaint);
        System.out.println("Plot Type: " + plot.getPlotType());

        // Additional complex logic
        for (int i = 0; i < 5; i++) {
            double value = Math.random() * 100;
            System.out.println("Random Value: " + value);
            if (value > 50) {
                System.out.println("Value is greater than 50");
            } else {
                System.out.println("Value is less than or equal to 50");
            }
        }
    }
}