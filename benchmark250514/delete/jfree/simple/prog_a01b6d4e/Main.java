import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;

public class Main {
    public static void main(String[] args) {
        // Create an instance of NumberAxis which is a subclass of ValueAxis
        ValueAxis axis = new NumberAxis();
        
        // Create a TickUnit instance
        TickUnit tickUnit = new TickUnit(5.0);

        // Use the write method to set the tick unit
        /* write */ axis.setTickUnit(tickUnit);

        // Use the read method to get the tick unit
        /* read */ TickUnit retrievedTickUnit = axis.getTickUnit();

        // Print the retrieved tick unit
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());
    }
}