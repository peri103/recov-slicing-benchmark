import org.jfree.chart.plot.ValueMarker;

public class ValueMarkerHandler {
    private ValueMarker marker;

    public ValueMarkerHandler(double initialValue) {
        this.marker = new ValueMarker(initialValue);
    }

    public void setMarkerValue(double value) {
        /* write */ marker.setValue(value);
    }

    public double getMarkerValue() {
        return marker.getValue();
    }
}