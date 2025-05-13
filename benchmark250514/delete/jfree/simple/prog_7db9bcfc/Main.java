import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the ValueAxis object
        ValueAxis axis = new ValueAxis() {
            @Override
            public double valueToJava2D(double value, java.awt.geom.Rectangle2D area, org.jfree.chart.axis.RectangleEdge edge) {
                return 0;
            }

            @Override
            public double java2DToValue(double java2DValue, java.awt.geom.Rectangle2D area, org.jfree.chart.axis.RectangleEdge edge) {
                return 0;
            }
        };

        // Create a NumberTickUnit object
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);

        // Write operation: Set the tick unit
        /* write */ axis.setTickUnit(tickUnit);

        // Read operation: Get the tick unit
        /* read */ NumberTickUnit readTickUnit = (NumberTickUnit) axis.getTickUnit();

        // Print the tick unit to verify
        System.out.println("Tick Unit: " + readTickUnit.getSize());
    }
}