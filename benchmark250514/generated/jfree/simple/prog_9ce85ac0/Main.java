import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;

public class Main {
    public static void main(String[] args) {
        // Create a NumberAxis instance
        NumberAxis axis = new NumberAxis();

        // Create a NumberTickUnit instance
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);

        // Use the write method to set the tick unit
        /* write */ axis.setTickUnit(tickUnit);

        // Use the read method to get the tick unit
        /* read */ NumberTickUnit retrievedTickUnit = axis.getTickUnit();

        // Print the tick unit to verify
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());
    }
}