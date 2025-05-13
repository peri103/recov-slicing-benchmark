import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class ChartRenderer {
    private XYStepAreaRenderer renderer = new XYStepAreaRenderer();

    public void setRendererPaint(int seriesIndex, Paint paint) {
        /* write */ renderer.setSeriesPaint(seriesIndex, paint);
    }

    public Paint getRendererPaint(int seriesIndex) {
        return renderer.getSeriesPaint(seriesIndex);
    }
}
