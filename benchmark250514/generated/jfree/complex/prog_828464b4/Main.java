import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;

public class Main {
    public static void main(String[] args) {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("Domain Axis");
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        XYPlot xyPlot = new XYPlot();
        xyPlot.setOrientation(PlotOrientation.VERTICAL);
        xyPlot.setRangeAxis(rangeAxis);

        // Simulate some operations with xyPlot
        double rangeLowerBound = xyPlot.getRangeAxis().getLowerBound();
        double rangeUpperBound = xyPlot.getRangeAxis().getUpperBound();
        System.out.println("Range Axis Lower Bound: " + rangeLowerBound);
        System.out.println("Range Axis Upper Bound: " + rangeUpperBound);

        // Set the domain axis for the category plot
        /* write */ plot.setDomainAxis(axis);

        // Perform some unrelated operations
        CategoryAxis anotherAxis = new CategoryAxis("Secondary Axis");
        plot.setRangeAxis(rangeAxis);
        plot.setDomainAxis(1, anotherAxis);

        // Simulate calculations and plot manipulations
        double rangeMiddle = (rangeLowerBound + rangeUpperBound) / 2;
        System.out.println("Range Middle: " + rangeMiddle);

        // Retrieve the domain axis from the category plot
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());

        // Perform more unrelated operations
        ValueAxis newRangeAxis = new NumberAxis("New Range Axis");
        xyPlot.setRangeAxis(newRangeAxis);
        System.out.println("New Range Axis Upper Bound: " + xyPlot.getRangeAxis().getUpperBound());
    }
}