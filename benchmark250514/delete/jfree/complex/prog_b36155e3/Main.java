import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.dial.DialNeedle;
import org.jfree.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.dial.DialValueIndicator;

public class Main {
    public static void main(String[] args) {
        CompassPlot compassPlot = new CompassPlot();
        DialNeedle needle = new DialNeedle();
        
        // Additional plot and indicator setup
        DialPlot dialPlot = new DialPlot();
        DialValueIndicator indicator = new DialValueIndicator(0);
        dialPlot.addLayer(indicator);

        // Perform operations on dialPlot
        indicator.setValue(10.5);
        dialPlot.setDialFrame(new org.jfree.chart.plot.dial.StandardDialFrame());
        
        /* write */ compassPlot.setSeriesNeedle(0, needle);
        
        // More operations on compassPlot
        compassPlot.setSeriesPaint(0, java.awt.Color.RED);
        compassPlot.setSeriesOutlinePaint(0, java.awt.Color.BLUE);
        
        // Read the value
        /* read */ DialNeedle readNeedle = compassPlot.getSeriesNeedle(0);
        
        // Additional logic
        boolean needlesEqual = readNeedle.equals(needle);
        System.out.println("Needles are equal: " + needlesEqual);
        
        // Further operations on dialPlot
        dialPlot.setBackgroundPaint(java.awt.Color.LIGHT_GRAY);
        dialPlot.setForegroundAlpha(0.5f);
        
        // Print dial plot details
        System.out.println("DialPlot background: " + dialPlot.getBackgroundPaint());
        System.out.println("DialPlot foreground alpha: " + dialPlot.getForegroundAlpha());
    }
}