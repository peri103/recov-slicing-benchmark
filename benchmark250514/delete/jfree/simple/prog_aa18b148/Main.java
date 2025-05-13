import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;

public class Main {
    public static void main(String[] args) {
        NumberAxis axis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(10.0);
        /* write */ axis.setTickUnit(tickUnit);
        /* read */ TickUnit retrievedTickUnit = axis.getTickUnit();
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());
    }
}