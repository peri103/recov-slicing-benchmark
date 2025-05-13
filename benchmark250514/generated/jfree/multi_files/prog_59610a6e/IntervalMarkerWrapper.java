import org.jfree.chart.plot.IntervalMarker;

public class IntervalMarkerWrapper {
    private IntervalMarker marker;

    public IntervalMarkerWrapper(double start, double end) {
        this.marker = new IntervalMarker(start, end);
    }

    public void setStartValue(double value) {
        /* write */ marker.setStartValue(value);
    }

    public double getStartValue() {
        return marker.getStartValue();
    }

    public double getEndValue() {
        return marker.getEndValue();
    }
}
