import org.jfree.chart.LegendItem;
import java.awt.Paint;

public class LegendItemProcessor {
    private LegendItem legendItem;

    public LegendItemProcessor(LegendItem legendItem) {
        this.legendItem = legendItem;
    }

    public Paint getLegendItemLabelPaint() {
        /* read */ return legendItem.getLabelPaint();
    }
}
