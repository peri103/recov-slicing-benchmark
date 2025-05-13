import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;

public class Main {
    public static void main(String[] args) {
        NumberAxis numberAxis = new NumberAxis();
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        /* write */ numberAxis.setTickUnit(tickUnit);
        
        /* read */ NumberTickUnit retrievedTickUnit = numberAxis.getTickUnit();
        
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());
    }
}