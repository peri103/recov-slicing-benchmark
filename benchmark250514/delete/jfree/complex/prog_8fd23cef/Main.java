import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        // Create an instance of XYPlot
        XYPlot plot = new XYPlot();

        // Create a NumberAxis instance to be used as the domain axis
        ValueAxis domainAxis = new NumberAxis("Domain Axis");

        // Create a NumberAxis instance to be used as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");

        // Create a renderer for the plot
        XYItemRenderer renderer = new XYLineAndShapeRenderer();

        // Add a legend item to the plot
        LegendItemCollection legendItems = new LegendItemCollection();
        legendItems.add(new LegendItem("Series 1"));
        plot.setFixedLegendItems(legendItems);

        // Set the range axis using a similar method
        plot.setRangeAxis(rangeAxis);

        // Use the write method to set the domain axis
        /* write */ plot.setDomainAxis(domainAxis);

        // Perform some unrelated calculations
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        double average = sum / data.length;
        System.out.println("Average: " + average);

        // Modify the renderer settings
        renderer.setBaseShapesVisible(true);
        renderer.setBaseShapesFilled(true);
        plot.setRenderer(renderer);

        // Use the read method to get the domain axis
        /* read */ ValueAxis readDomainAxis = plot.getDomainAxis();

        // Print the domain axis to ensure it was set correctly
        System.out.println("Domain Axis Label: " + readDomainAxis.getLabel());

        // Print the legend items to ensure it was set correctly
        LegendItemCollection readLegendItems = plot.getFixedLegendItems();
        for (LegendItem item : readLegendItems) {
            System.out.println("Legend Item: " + item.getLabel());
        }
    }
}