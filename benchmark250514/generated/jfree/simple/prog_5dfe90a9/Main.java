import org.jfree.chart.plot.IntervalMarker;

public class Main {
    public static void main(String[] args) {
        IntervalMarker marker = new IntervalMarker(0.0, 1.0);
        /* write */ marker.setStartValue(0.5);
        /* read */ double startValue = marker.getStartValue();
        System.out.println(startValue);
    }
}