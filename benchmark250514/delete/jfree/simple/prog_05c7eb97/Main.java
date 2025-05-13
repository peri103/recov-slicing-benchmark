import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;

public class Main {
    public static void main(String[] args) {
        NumberAxis numberAxis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(5.0);
        
        /* write */ numberAxis.setTickUnit(tickUnit);
        /* read */ TickUnit readTickUnit = numberAxis.getTickUnit();
        
        System.out.println("Tick Unit: " + readTickUnit.getSize());
    }
}