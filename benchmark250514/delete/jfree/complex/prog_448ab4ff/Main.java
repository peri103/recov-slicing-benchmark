import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.NumberTickUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of NumberAxis which is a subclass of ValueAxis
        ValueAxis axis = new NumberAxis();

        // Create a NumberTickUnit to set on the axis
        TickUnit tickUnit = new NumberTickUnit(5.0);

        /* write */ axis.setTickUnit(tickUnit);

        // Create a list to hold multiple tick units
        List<TickUnit> tickUnits = new ArrayList<>();
        tickUnits.add(new NumberTickUnit(1.0));
        tickUnits.add(new NumberTickUnit(2.0));
        tickUnits.add(new NumberTickUnit(5.0));

        // Perform operations on the list of tick units
        for (TickUnit tu : tickUnits) {
            System.out.println("Tick Unit Size: " + tu.getSize());
        }

        // Additional unrelated operation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Perform some operations on axis
        axis.setTickLabelsVisible(true);

        // Retrieve the tick unit set earlier
        /* read */ TickUnit readTickUnit = axis.getTickUnit();

        // Print the tick unit value to verify
        System.out.println("Read Tick Unit Size: " + readTickUnit.getSize());

        // Additional unrelated operation with a different axis
        ValueAxis anotherAxis = new NumberAxis();
        anotherAxis.setTickUnit(new NumberTickUnit(10.0));
        System.out.println("Another Axis Tick Unit Size: " + anotherAxis.getTickUnit().getSize());
    }
}