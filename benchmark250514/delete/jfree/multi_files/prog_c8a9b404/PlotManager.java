import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class PlotManager {
    private Plot plot = new Plot() {
        private Paint backgroundPaint;

        @Override
        public void setBackgroundPaint(Paint paint) {
            this.backgroundPaint = paint;
        }

        @Override
        public Paint getBackgroundPaint() {
            return this.backgroundPaint;
        }
    };

    public void setPlotBackground(Color color) {
        /* write */ plot.setBackgroundPaint(color);
    }

    public Paint getPlotBackground() {
        return plot.getBackgroundPaint();
    }
}