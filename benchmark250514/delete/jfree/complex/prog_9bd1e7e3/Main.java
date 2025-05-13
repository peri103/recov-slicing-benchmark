import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.Plot;

public class Main {
    public static void main(String[] args) {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("Domain Axis");
        
        // Additional variables and operations
        NumberAxis numberAxis = new NumberAxis("Range Axis");
        ValueAxis valueAxis = new NumberAxis("Secondary Axis");
        PlotOrientation orientation = PlotOrientation.VERTICAL;

        plot.setRangeAxis(numberAxis);
        plot.setOrientation(orientation);

        // Manipulating and setting properties in the plot
        plot.setRangeAxisLocation(Plot.DEFAULT_AXIS_LOCATION);
        plot.setRangeAxis(1, valueAxis);

        /* write */ plot.setDomainAxis(axis);

        // More operations on plot
        plot.mapDatasetToRangeAxis(0, 1);
        plot.setFixedLegendItems(null);

        /* read */ CategoryAxis readAxis = plot.getDomainAxis();

        System.out.println("Domain Axis Label: " + readAxis.getLabel());

        // Further complex operations
        valueAxis.setAutoRangeIncludesZero(false);
        numberAxis.setLowerMargin(0.05);
        numberAxis.setUpperMargin(0.05);
        
        // Additional printing for complexity
        System.out.println("Range Axis Label: " + numberAxis.getLabel());
        System.out.println("Orientation: " + plot.getOrientation());
    }
}