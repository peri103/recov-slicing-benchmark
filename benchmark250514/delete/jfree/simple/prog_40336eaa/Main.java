import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;

public class Main {
    public static void main(String[] args) {
        NumberAxis axis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(5.0);
        
        /* write */ axis.setTickUnit(tickUnit);
        /* read */ TickUnit readTickUnit = axis.getTickUnit();
        
        System.out.println("Tick Unit: " + readTickUnit.getSize());
    }
}