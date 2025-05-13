import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;

public class Main {
    public static void main(String[] args) {
        NumberAxis axis = new NumberAxis();
        
        // Create a TickUnit instance to use with setTickUnit
        TickUnit tickUnit = new TickUnit(5.0);
        
        /* write */ axis.setTickUnit(tickUnit);
        
        /* read */ TickUnit readTickUnit = axis.getTickUnit();
        
        // Print the value to verify the read operation
        System.out.println("TickUnit value: " + readTickUnit.getSize());
    }
}