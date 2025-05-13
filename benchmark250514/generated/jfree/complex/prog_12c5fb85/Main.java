import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        ValueAxis axis = new NumberAxis("Range Axis");
        
        /* write */ plot.setRangeAxis(axis);
        
        // Create a simple XY chart
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 2.5);
        
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Sample Chart",
            "X-Axis",
            "Y-Axis",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
        
        // Manipulate plot further
        plot.setDataset(dataset);
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        
        ValueAxis domainAxis = new NumberAxis("Domain Axis");
        plot.setDomainAxis(domainAxis);
        
        // More complex manipulation
        for (int i = 0; i < series.getItemCount(); i++) {
            double x = series.getX(i).doubleValue();
            double y = series.getY(i).doubleValue();
            System.out.println("Point: (" + x + ", " + y + ")");
        }
        
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        System.out.println("Retrieved Range Axis Label: " + retrievedAxis.getLabel());
        
        // Additional unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
        
        // Final chart configuration
        chart.getXYPlot().setRangeAxis(axis);
        chart.getXYPlot().setDomainAxis(domainAxis);
        
        // Print final chart orientation
        System.out.println("Chart Orientation: " + chart.getXYPlot().getOrientation());
    }
}