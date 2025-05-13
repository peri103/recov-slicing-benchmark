import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        CombinedRangeXYPlot combinedPlot = new CombinedRangeXYPlot();
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        /* write */ combinedPlot.setRangeAxis(rangeAxis);

        // Adding additional complexity
        XYSeries series1 = new XYSeries("Series1");
        series1.add(1.0, 2.0);
        series1.add(2.0, 3.0);
        series1.add(3.0, 2.5);

        XYSeries series2 = new XYSeries("Series2");
        series2.add(1.0, 4.0);
        series2.add(2.0, 5.0);
        series2.add(3.0, 6.0);

        XYSeriesCollection dataset1 = new XYSeriesCollection();
        dataset1.addSeries(series1);

        XYSeriesCollection dataset2 = new XYSeriesCollection();
        dataset2.addSeries(series2);

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        XYPlot plot1 = new XYPlot(dataset1, null, rangeAxis, renderer);
        XYPlot plot2 = new XYPlot(dataset2, null, rangeAxis, renderer);

        combinedPlot.add(plot1);
        combinedPlot.add(plot2);

        // Performing some operations on the plot
        plot1.setDomainGridlinesVisible(true);
        plot2.setDomainGridlinesVisible(false);

        // More unrelated operations
        NumberAxis domainAxis = new NumberAxis("Domain Axis");
        plot1.setDomainAxis(domainAxis);
        plot2.setDomainAxis(domainAxis);

        // Final read operation
        /* read */ ValueAxis readAxis = combinedPlot.getRangeAxis();
        System.out.println(readAxis.getLabel());

        // Additional operations
        double lowerBound = readAxis.getRange().getLowerBound();
        double upperBound = readAxis.getRange().getUpperBound();
        System.out.println("Lower Bound: " + lowerBound);
        System.out.println("Upper Bound: " + upperBound);
    }
}