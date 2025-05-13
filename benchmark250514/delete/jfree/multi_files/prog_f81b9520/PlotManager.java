import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

public class PlotManager {
    private Plot plot;

    public PlotManager() {
        plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };
    }

    public void setPlotOutlinePaint(Paint paint) {
        /* write */ plot.setOutlinePaint(paint);
    }

    public Paint getPlotOutlinePaint() {
        return plot.getOutlinePaint();
    }
}