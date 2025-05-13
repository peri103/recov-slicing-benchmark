import org.jfree.chart.LegendItem;
import java.awt.Color;

public class LegendItemWrapper {
    private LegendItem legendItem;

    public LegendItemWrapper(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setLegendItemLabelPaint(Color color) {
        /* write */ legendItem.setLabelPaint(color);
    }

    public LegendItem getLegendItem() {
        return legendItem;
    }
}
