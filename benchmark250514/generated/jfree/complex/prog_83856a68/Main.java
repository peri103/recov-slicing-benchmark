import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;

public class Main {
    public static void main(String[] args) {
        CombinedRangeXYPlot plot = new CombinedRangeXYPlot();
        NumberAxis rangeAxis = new NumberAxis("Range Axis");
        
        /* write */ plot.setRangeAxis(rangeAxis);
        
        // Additional complexity: creating and configuring a CategoryPlot
        CategoryAxis categoryAxis = new CategoryAxis("Category Axis");
        NumberAxis valueAxis = new NumberAxis("Value Axis");
        CategoryPlot categoryPlot = new CategoryPlot(null, categoryAxis, valueAxis, null);
        categoryPlot.setOrientation(PlotOrientation.HORIZONTAL);
        
        // Manipulating the plot
        CombinedRangeXYPlot anotherPlot = new CombinedRangeXYPlot();
        anotherPlot.setRangeAxis(new NumberAxis("Another Range Axis"));
        
        // Using the CategoryPlot
        categoryPlot.setRangeAxis(new NumberAxis("New Value Axis"));
        NumberAxis retrievedAxis = (NumberAxis) categoryPlot.getRangeAxis();
        System.out.println("Category Plot Range Axis Label: " + retrievedAxis.getLabel());
        
        // More unrelated operations
        double axisLowerBound = rangeAxis.getLowerBound();
        double axisUpperBound = rangeAxis.getUpperBound();
        System.out.println("Range Axis Lower Bound: " + axisLowerBound);
        System.out.println("Range Axis Upper Bound: " + axisUpperBound);
        
        // Some calculations
        double midpoint = (axisLowerBound + axisUpperBound) / 2;
        System.out.println("Midpoint of Range Axis: " + midpoint);
        
        // Return to the original plot
        /* read */ NumberAxis readAxis = (NumberAxis) plot.getRangeAxis();
        
        // Output the label of the range axis to verify
        System.out.println("Range Axis Label: " + readAxis.getLabel());
    }
}