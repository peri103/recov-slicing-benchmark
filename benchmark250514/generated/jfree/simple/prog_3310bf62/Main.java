import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;

public class Main {
    public static void main(String[] args) {
        NumberAxis axis = new NumberAxis();
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        /* write */ axis.setTickUnit(tickUnit);
        /* read */ NumberTickUnit readTickUnit = axis.getTickUnit();
        
        System.out.println("Tick Unit: " + readTickUnit.getSize());
    }
}