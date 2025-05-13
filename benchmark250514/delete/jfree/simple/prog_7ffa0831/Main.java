import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the ValueAxis object
        ValueAxis axis = new NumberAxis();
        
        // Create a NumberTickUnit object to be used for setting the tick unit
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        // Use the write method to set the tick unit
        /* write */ axis.setTickUnit(tickUnit);
        
        // Use the read method to get the tick unit
        /* read */ NumberTickUnit readTickUnit = (NumberTickUnit) axis.getTickUnit();
        
        // Print the tick unit value to verify the read operation
        System.out.println("Tick Unit: " + readTickUnit.getSize());
    }
}