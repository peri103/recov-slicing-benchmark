import org.jfree.chart.axis.TickUnit;

public class Main {
    public static void main(String[] args) {
        AxisManager axisManager = new AxisManager();
        axisManager.addAxisWithTickUnit(5.0);
        axisManager.addAxisWithTickUnit(2.5);
        axisManager.addAxisWithTickUnit(1.0);

        // Retrieve and print the tick unit size of the first axis
        AxisConfiguration firstConfig = axisManager.getAxisConfigurations().get(0);
        /* read */ TickUnit retrievedTickUnit = firstConfig.getAxisTickUnit();
        System.out.println("Retrieved Tick Unit: " + retrievedTickUnit.getSize());

        // Print the tick unit sizes of all axes
        for (AxisConfiguration config : axisManager.getAxisConfigurations()) {
            System.out.println("Axis Tick Unit: " + config.getAxisTickUnit().getSize());
        }
    }
}