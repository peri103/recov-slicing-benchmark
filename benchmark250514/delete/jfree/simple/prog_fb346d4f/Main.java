import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.ValueAxis;

public class Main {
    public static void main(String[] args) {
        // Create an instance of NumberAxis which is a subclass of ValueAxis
        ValueAxis axis = new NumberAxis();

        // Create a TickUnit with a specific size
        TickUnit tickUnit = new TickUnit(5.0);

        // Use the write method to set the tick unit
        /* write */ axis.setTickUnit(tickUnit);

        // Use the read method to get the tick unit
        /* read */ TickUnit retrievedTickUnit = axis.getTickUnit();

        // Print out the size of the retrieved tick unit to verify it matches the set value
        System.out.println("Tick Unit Size: " + retrievedTickUnit.getSize());
    }
}