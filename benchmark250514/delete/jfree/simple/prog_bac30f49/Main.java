import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.PaintScale;
import org.jfree.chart.renderer.GrayPaintScale;

public class Main {
    public static void main(String[] args) {
        // Initialize the WaferMapPlot object
        WaferMapPlot waferMapPlot = new WaferMapPlot();

        // Create a PaintScale object to be used for setting the paint scale
        PaintScale paintScale = new GrayPaintScale();

        /* write */ waferMapPlot.setPaintScale(paintScale);

        /* read */ PaintScale retrievedPaintScale = waferMapPlot.getPaintScale();

        // Verify that the paint scale set is the same as the one retrieved
        System.out.println("PaintScale set and retrieved are the same: " + (paintScale == retrievedPaintScale));
    }
}