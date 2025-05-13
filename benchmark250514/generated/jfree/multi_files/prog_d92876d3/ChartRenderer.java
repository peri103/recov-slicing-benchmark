import org.jfree.chart.renderer.xy.XYBarRenderer;
import java.awt.Color;
import java.awt.Paint;

public class ChartRenderer {
    private XYBarRenderer barRenderer = new XYBarRenderer();
    private int seriesIndex = 0;
    
    public void setBarOutlinePaint(Paint paint) {
        /* write */ barRenderer.setSeriesOutlinePaint(seriesIndex, paint);
    }
    
    public Paint getBarOutlinePaint() {
        return barRenderer.getSeriesOutlinePaint(seriesIndex);
    }
}
