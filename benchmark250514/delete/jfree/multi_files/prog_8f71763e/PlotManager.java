import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class PlotManager {
    private Plot plot;

    public PlotManager() {
        plot = new Plot() {
            // Implement abstract methods with dummy implementations
            public String getPlotType() { return ""; }
            protected void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, 
                                org.jfree.chart.plot.PlotState state, 
                                org.jfree.chart.plot.PlotRenderingInfo info) {}
        };
    }

    public void setPlotBackground(Color color) {
        /* write */ plot.setBackgroundPaint(color);
    }

    public Paint getPlotBackground() {
        return plot.getBackgroundPaint();
    }
}
