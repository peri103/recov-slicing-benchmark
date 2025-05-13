import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize a NumberAxis object
        NumberAxis axis = new NumberAxis();
        
        // Create a TickUnit object
        TickUnit tickUnit = new TickUnit(5.0);
        
        // Write: Set the tick unit for the axis
        /* write */ axis.setTickUnit(tickUnit);
        
        // Read: Get the tick unit from the axis
        /* read */ TickUnit readTickUnit = axis.getTickUnit();
        
        // Print the value to ensure the read method gets the correct value
        System.out.println("Tick Unit: " + readTickUnit.getSize());
    }
}