import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ValueAxis using NumberAxis
        ValueAxis axis = new NumberAxis();
        
        // Define a range to be set
        Range rangeToSet = new Range(0.0, 100.0);
        
        /* write */ axis.setRange(rangeToSet);
        
        /* read */ Range rangeRead = axis.getRange();
        
        System.out.println("Range: " + rangeRead);
    }
}