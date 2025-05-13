import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return null;
            }

            @Override
            public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
                // Implementation not needed for this example
            }
        };

        /* write */ plot.setBackgroundPaint(Color.BLUE);
        /* read */ Paint paint = plot.getBackgroundPaint();
        System.out.println(paint);
    }
}