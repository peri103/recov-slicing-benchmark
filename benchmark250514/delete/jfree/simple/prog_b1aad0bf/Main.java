import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.ValueAxis;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(1.0);
        
        /* write */ axis.setTickUnit(tickUnit);
        /* read */ TickUnit readTickUnit = axis.getTickUnit();
        
        System.out.println("Tick Unit: " + readTickUnit.getSize());
    }
}