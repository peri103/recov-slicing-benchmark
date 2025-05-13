import org.jfree.chart.LegendItem;
import java.awt.Color;

public class LegendItemWrapper {
    private LegendItem legendItem;

    public LegendItemWrapper(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setLabelPaint(Color color) {
        /* write */ legendItem.setLabelPaint(color);
    }

    public Color getLabelPaint() {
        return (Color) legendItem.getLabelPaint();
    }

    public LegendItem getLegendItem() {
        return legendItem;
    }
}