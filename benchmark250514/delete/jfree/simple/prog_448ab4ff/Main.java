import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.NumberTickUnit;

public class Main {
    public static void main(String[] args) {
        // Create an instance of NumberAxis which is a subclass of ValueAxis
        ValueAxis axis = new NumberAxis();

        // Create a NumberTickUnit to set on the axis
        TickUnit tickUnit = new NumberTickUnit(5.0);

        /* write */ axis.setTickUnit(tickUnit);

        /* read */ TickUnit readTickUnit = axis.getTickUnit();

        // Print the tick unit value to verify
        System.out.println(readTickUnit.getSize());
    }
}