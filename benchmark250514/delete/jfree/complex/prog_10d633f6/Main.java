import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        CategoryAxis categoryAxis = new CategoryAxis("Category Axis");
        ArrayList<ValueAxis> axisList = new ArrayList<>();
        
        // Adding multiple axes to the list
        axisList.add(rangeAxis);
        axisList.add(categoryAxis);
        axisList.add(new LogarithmicAxis("Log Axis"));
        
        // Setting range axis
        /* write */ plot.setRangeAxis(rangeAxis);

        // Adding more operations
        for (ValueAxis axis : axisList) {
            System.out.println("Axis Label: " + axis.getLabel());
        }
        
        // Retrieving the range axis
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());
        
        // Performing additional operations
        NumberAxis anotherAxis = new NumberAxis("Another Axis");
        plot.setRangeAxis(1, anotherAxis);
        ValueAxis axisAtIndex1 = plot.getRangeAxis(1);
        System.out.println("Axis at index 1: " + axisAtIndex1.getLabel());
        
        // Manipulating the axis list
        axisList.remove(categoryAxis);
        axisList.add(anotherAxis);
        
        for (ValueAxis axis : axisList) {
            System.out.println("Updated Axis Label: " + axis.getLabel());
        }
    }
}