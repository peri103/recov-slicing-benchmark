import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.PaintScale;
import org.jfree.chart.renderer.GrayPaintScale;

public class Main {
    public static void main(String[] args) {
        WaferMapPlot plot = new WaferMapPlot();
        PaintScale paintScale = new GrayPaintScale(0.0, 100.0);
        
        /* write */ plot.setPaintScale(paintScale);
        
        /* read */ PaintScale retrievedPaintScale = plot.getPaintScale();
        
        System.out.println("PaintScale Range: " + retrievedPaintScale.getLowerBound() + " to " + retrievedPaintScale.getUpperBound());
    }
}