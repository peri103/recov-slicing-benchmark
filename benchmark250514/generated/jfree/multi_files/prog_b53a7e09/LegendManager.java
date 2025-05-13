import org.jfree.chart.LegendItem;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class LegendManager {
    private LegendItem legendItem;

    public LegendManager(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setStroke(float width) {
        Stroke stroke = new BasicStroke(width);
        /* write */ legendItem.setLineStroke(stroke);
    }

    public LegendItem getLegendItem() {
        return legendItem;
    }
}
