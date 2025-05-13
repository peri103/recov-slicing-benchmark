import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.AxisLocation;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NumberAxis numberAxis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(5.0);
        
        // Create a CategoryAxis and set some properties
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setCategoryMargin(0.2);
        categoryAxis.setLowerMargin(0.1);
        categoryAxis.setUpperMargin(0.1);
        
        // ArrayList to store axis locations
        ArrayList<AxisLocation> axisLocations = new ArrayList<>();
        axisLocations.add(AxisLocation.BOTTOM_OR_LEFT);
        axisLocations.add(AxisLocation.TOP_OR_RIGHT);
        
        // Iterate over axis locations and print them
        for (AxisLocation location : axisLocations) {
            System.out.println("Axis Location: " + location.toString());
        }
        
        // Set tick unit for numberAxis
        /* write */ numberAxis.setTickUnit(tickUnit);
        
        // Perform some calculations
        double totalMargin = categoryAxis.getCategoryMargin() + categoryAxis.getLowerMargin() + categoryAxis.getUpperMargin();
        System.out.println("Total Margin: " + totalMargin);
        
        // Retrieve the tick unit from numberAxis
        /* read */ TickUnit retrievedTickUnit = numberAxis.getTickUnit();
        
        // Print the tick unit size
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());
        
        // More calculations and operations
        double axisRange = numberAxis.getRange().getLength();
        System.out.println("Axis Range Length: " + axisRange);
        
        // Add more axis locations
        axisLocations.add(AxisLocation.BOTTOM_OR_RIGHT);
        axisLocations.add(AxisLocation.TOP_OR_LEFT);
        
        // Iterate and print again after adding more locations
        for (AxisLocation location : axisLocations) {
            System.out.println("Updated Axis Location: " + location.toString());
        }
    }
}