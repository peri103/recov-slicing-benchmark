import org.jfree.chart.plot.dial.DialNeedle;

public class Main {
    public static void main(String[] args) {
        CompassPlotWrapper compassPlotWrapper = new CompassPlotWrapper();
        DialPlotWrapper dialPlotWrapper = new DialPlotWrapper();

        // Setup dial plot
        dialPlotWrapper.setupDialPlot();

        // Set the needle in the compass plot
        compassPlotWrapper.setNeedle();

        // Perform additional operations on compassPlot
        compassPlotWrapper.getCompassPlot().setSeriesPaint(0, java.awt.Color.RED);
        compassPlotWrapper.getCompassPlot().setSeriesOutlinePaint(0, java.awt.Color.BLUE);

        // Read the needle from the compass plot
        /* read */ DialNeedle readNeedle = compassPlotWrapper.getNeedle();

        // Verify the needle
        boolean needlesEqual = readNeedle.equals(compassPlotWrapper.getNeedle());
        System.out.println("Needles are equal: " + needlesEqual);

        // Print dial plot details
        System.out.println("DialPlot background: " + dialPlotWrapper.getDialPlot().getBackgroundPaint());
        System.out.println("DialPlot foreground alpha: " + dialPlotWrapper.getDialPlot().getForegroundAlpha());
    }
}