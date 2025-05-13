import org.jfree.chart.plot.ValueMarker;

public class ValueHandler {
    private ValueMarker marker;

    public ValueHandler(double initialValue) {
        marker = new ValueMarker(initialValue);
    }

    public void setMarkerValue(double value) {
        /* write */ marker.setValue(value);
    }

    public double getMarkerValue() {
        return marker.getValue();
    }
}