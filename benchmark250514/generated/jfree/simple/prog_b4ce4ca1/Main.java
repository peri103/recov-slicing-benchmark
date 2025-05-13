import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        Range rangeToSet = new Range(0.0, 10.0);

        /* write */ axis.setRange(rangeToSet);
        /* read */ Range rangeRead = axis.getRange();

        System.out.println("Range: " + rangeRead);
    }
}