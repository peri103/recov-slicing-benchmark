import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;

public class Main {
    public static void main(String[] args) {
        NumberAxis axis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(5.0); // Create a TickUnit with a specific value
        /* write */ axis.setTickUnit(tickUnit);
        /* read */ TickUnit retrievedTickUnit = axis.getTickUnit();
        System.out.println(retrievedTickUnit.getSize()); // Output the size of the retrieved TickUnit
    }
}