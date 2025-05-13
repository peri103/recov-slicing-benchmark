import org.jfree.chart.plot.IntervalMarker;

public class Main {
    public static void main(String[] args) {
        IntervalMarker marker = new IntervalMarker(0, 10);
        /* write */ marker.setStartValue(5.0);
        /* read */ double startValue = marker.getStartValue();
        System.out.println(startValue);
    }
}