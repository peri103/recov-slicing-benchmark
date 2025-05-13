import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.PaintScale;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        WaferMapPlot plot = new WaferMapPlot();
        PaintScale paintScale = new PaintScale() {
            @Override
            public double getLowerBound() {
                return 0.0;
            }

            @Override
            public double getUpperBound() {
                return 1.0;
            }

            @Override
            public Color getPaint(double value) {
                return Color.RED;
            }
        };
        
        /* write */ plot.setPaintScale(paintScale);
        /* read */ PaintScale retrievedPaintScale = plot.getPaintScale();

        if (retrievedPaintScale != null) {
            System.out.println("PaintScale set and retrieved successfully.");
        } else {
            System.out.println("Failed to retrieve PaintScale.");
        }
    }
}