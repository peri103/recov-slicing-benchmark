import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class ChartPlot extends Plot {
    private Paint backgroundPaint;

    @Override
    public String getPlotType() {
        return "Custom Plot";
    }

    @Override
    public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
        // Implementation not needed for this example
    }

    public void setCustomBackgroundPaint(Color color) {
        /* write */ this.backgroundPaint = color;
    }

    public Paint getCustomBackgroundPaint() {
        return backgroundPaint;
    }
}
