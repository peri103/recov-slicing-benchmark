import org.jfree.chart.plot.ValueMarker;

public class Main {
    public static void main(String[] args) {
        ValueMarker marker = new ValueMarker(0.0);
        /* write */ marker.setValue(10.0);
        /* read */ double value = marker.getValue();
        System.out.println(value);
    }
}