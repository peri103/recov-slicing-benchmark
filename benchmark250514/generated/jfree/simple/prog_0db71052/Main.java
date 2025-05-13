import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        Range range = new Range(0.0, 10.0);
        /* write */ axis.setRange(range);
        /* read */ Range readRange = axis.getRange();
        System.out.println("Range: " + readRange);
    }
}