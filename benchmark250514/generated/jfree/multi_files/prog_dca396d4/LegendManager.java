import org.jfree.chart.LegendItem;
import java.awt.Color;

public class LegendManager {
    private LegendItem legendItem;

    public LegendManager(String label) {
        legendItem = new LegendItem(label);
    }

    public void setLegendLabelPaint(Color color) {
        /* write */ legendItem.setLabelPaint(color);
    }

    public LegendItem getLegendItem() {
        return legendItem;
    }
}
