import org.jfree.chart.LegendItem;
import java.awt.Shape;

public class LegendItemWrapper {
    private LegendItem legendItem;

    public LegendItemWrapper(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setLegendShape(Shape shape) {
        /* write */ legendItem.setShape(shape);
    }

    public LegendItem getLegendItem() {
        return legendItem;
    }
}
