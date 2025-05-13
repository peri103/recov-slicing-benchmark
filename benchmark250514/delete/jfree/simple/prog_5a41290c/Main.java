import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        NumberTickUnit tickUnit = new NumberTickUnit(5.0);
        
        /* write */ axis.setTickUnit(tickUnit);
        
        /* read */ NumberTickUnit retrievedTickUnit = axis.getTickUnit();
        
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());
    }
}