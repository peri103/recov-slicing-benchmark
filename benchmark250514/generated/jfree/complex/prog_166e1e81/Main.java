import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot
        XYPlot plot = new XYPlot();

        // Create a new NumberAxis to be used as the domain axis
        ValueAxis domainAxis = new NumberAxis("Domain Axis");

        // Create a new NumberAxis to be used as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");

        // Create a dataset and a renderer
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 4.0);

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        XYItemRenderer renderer = new StandardXYItemRenderer();

        // Set the range axis and renderer
        plot.setRangeAxis(rangeAxis);
        plot.setDataset(dataset);
        plot.setRenderer(renderer);

        /* write */ plot.setDomainAxis(domainAxis);

        // Perform some operations on the dataset
        for (int i = 0; i < dataset.getSeriesCount(); i++) {
            XYSeries s = dataset.getSeries(i);
            for (int j = 0; j < s.getItemCount(); j++) {
                double x = s.getX(j).doubleValue();
                double y = s.getY(j).doubleValue();
                System.out.println("Point: (" + x + ", " + y + ")");
            }
        }

        // Perform some operations on the renderer
        System.out.println("Renderer class: " + plot.getRenderer().getClass().getSimpleName());

        /* read */ ValueAxis retrievedAxis = plot.getDomainAxis();

        // Print out the label of the domain axis to verify
        System.out.println(retrievedAxis.getLabel());

        // Additional operations to add complexity
        plot.setRangeAxis(new NumberAxis("New Range Axis"));
        plot.setRenderer(new StandardXYItemRenderer());

        // Print out the label of the new range axis
        System.out.println(plot.getRangeAxis().getLabel());
    }
}