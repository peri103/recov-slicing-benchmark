import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.PaintScale;
import org.jfree.chart.renderer.GrayPaintScale;

public class Main {
    public static void main(String[] args) {
        WaferMapPlot plot = new WaferMapPlot();
        PaintScale paintScale = new GrayPaintScale(); // Example paint scale

        /* write */ plot.setPaintScale(paintScale);
        /* read */ PaintScale readPaintScale = plot.getPaintScale();

        System.out.println(readPaintScale.equals(paintScale));
    }
}