import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create an Axis instance
        Axis axis = new NumberAxis();
        /* write */ axis.setLabel("X-Axis");

        // Create a dataset
        XYSeries series = new XYSeries("Data");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.sin(i));
        }
        
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a plot
        Plot plot = new XYPlot();
        ((XYPlot) plot).setDataset(dataset);
        ((XYPlot) plot).setDomainAxis((NumberAxis) axis);

        // Create a chart
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Sample Chart",
            /* read */ axis.getLabel(),
            "Y-Axis",
            dataset
        );

        // Print chart title
        System.out.println(chart.getTitle().getText());

        // Additional operations
        Axis yAxis = new NumberAxis();
        yAxis.setLabel("Y-Axis");
        ((XYPlot) plot).setRangeAxis((NumberAxis) yAxis);

        // Print labels
        System.out.println("Domain Axis Label: " + axis.getLabel());
        System.out.println("Range Axis Label: " + yAxis.getLabel());
    }
}