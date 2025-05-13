import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.TickUnits;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize ValueAxis and TickUnit
        ValueAxis axis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(5.0);

        // Initialize a list of TickUnits
        TickUnits tickUnits = new TickUnits();
        tickUnits.add(new TickUnit(1.0));
        tickUnits.add(new TickUnit(2.0));
        tickUnits.add(new TickUnit(3.0));
        tickUnits.add(new TickUnit(4.0));
        tickUnits.add(tickUnit);

        // Initialize a list to store axis configurations
        List<ValueAxis> axisList = new ArrayList<>();
        axisList.add(axis);

        // Set a TickUnit to the axis
        /* write */ axis.setTickUnit(tickUnit);

        // Perform operations with tickUnits
        for (int i = 0; i < tickUnits.size(); i++) {
            TickUnit tu = tickUnits.get(i);
            System.out.println("Tick Unit Size: " + tu.getSize());
        }

        // Retrieve the TickUnit from the axis
        /* read */ TickUnit retrievedTickUnit = axis.getTickUnit();

        // Print the retrieved TickUnit size
        System.out.println("Retrieved Tick Unit: " + retrievedTickUnit.getSize());

        // Add more axes with different configurations
        for (int i = 0; i < 3; i++) {
            ValueAxis newAxis = new NumberAxis();
            newAxis.setTickUnit(new TickUnit(i + 1.5));
            axisList.add(newAxis);
        }

        // Print all axis configurations
        for (ValueAxis va : axisList) {
            System.out.println("Axis Tick Unit: " + va.getTickUnit().getSize());
        }
    }
}