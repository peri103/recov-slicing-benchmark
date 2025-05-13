import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.MeterNeedle;

public class Main {
    public static void main(String[] args) {
        CompassPlot compassPlot = new CompassPlot();
        MeterNeedle needle = new MeterNeedle(); // Assuming MeterNeedle is a valid needle type
        
        /* write */ compassPlot.setSeriesNeedle(0, needle); // Set the needle for series 0
        
        /* read */ MeterNeedle retrievedNeedle = compassPlot.getSeriesNeedle(0); // Get the needle for series 0
        
        System.out.println(retrievedNeedle.equals(needle)); // Check if the needle was set correctly
    }
}