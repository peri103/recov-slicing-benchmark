import org.jfree.chart.plot.IntervalMarker;

public class Main {
    public static void main(String[] args) {
        IntervalMarker marker = new IntervalMarker(0.0, 1.0);
        /* write */ marker.setStartValue(5.0);
        /* read */ double value = marker.getStartValue();
        System.out.println(value);
    }
}