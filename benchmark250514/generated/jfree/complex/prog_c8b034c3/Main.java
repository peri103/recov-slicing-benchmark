import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create a CombinedRangeXYPlot and set its range axis
        CombinedRangeXYPlot plot = new CombinedRangeXYPlot();
        ValueAxis axis = new NumberAxis("Range Axis");
        /* write */ plot.setRangeAxis(axis);

        // Add some XYPlots to the CombinedRangeXYPlot
        XYSeries series1 = new XYSeries("Series1");
        series1.add(1.0, 2.0);
        series1.add(2.0, 3.0);
        series1.add(3.0, 2.5);

        XYSeries series2 = new XYSeries("Series2");
        series2.add(1.0, 4.0);
        series2.add(2.0, 5.0);
        series2.add(3.0, 4.5);

        XYSeriesCollection dataset1 = new XYSeriesCollection(series1);
        XYSeriesCollection dataset2 = new XYSeriesCollection(series2);

        XYItemRenderer renderer1 = new StandardXYItemRenderer();
        XYItemRenderer renderer2 = new StandardXYItemRenderer();

        XYPlot subplot1 = new XYPlot(dataset1, null, axis, renderer1);
        XYPlot subplot2 = new XYPlot(dataset2, null, axis, renderer2);

        plot.add(subplot1);
        plot.add(subplot2);

        // Perform some operations on the plots
        for (int i = 0; i < dataset1.getSeriesCount(); i++) {
            System.out.println("Series1, Item " + i + ": " + dataset1.getSeries(i).getKey());
        }

        for (int i = 0; i < dataset2.getSeriesCount(); i++) {
            System.out.println("Series2, Item " + i + ": " + dataset2.getSeries(i).getKey());
        }

        // Retrieve and print the range axis label
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());

        // Modify the series data
        series1.add(4.0, 3.5);
        series2.add(4.0, 5.5);

        // Print modified series data
        for (int i = 0; i < dataset1.getSeriesCount(); i++) {
            System.out.println("Modified Series1, Item " + i + ": " + dataset1.getSeries(i).getKey());
        }

        for (int i = 0; i < dataset2.getSeriesCount(); i++) {
            System.out.println("Modified Series2, Item " + i + ": " + dataset2.getSeries(i).getKey());
        }
    }
}