import org.jfree.chart.LegendItem;
import java.awt.Paint;

public class LegendItemManager {
    private LegendItem legendItem;

    public LegendItemManager(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setLegendItemFillPaint(Paint paint) {
        /* write */ legendItem.setFillPaint(paint);
    }

    public LegendItem getLegendItem() {
        return legendItem;
    }
}