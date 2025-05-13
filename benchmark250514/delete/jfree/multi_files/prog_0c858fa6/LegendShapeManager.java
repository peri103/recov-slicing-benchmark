import org.jfree.chart.LegendItem;
import java.awt.Shape;

public class LegendShapeManager {
    private LegendItem legendItem;

    public LegendShapeManager(String legendName) {
        this.legendItem = new LegendItem(legendName);
    }

    public void setLegendShape(Shape shape) {
        /* write */ legendItem.setShape(shape);
    }

    public Shape getLegendShape() {
        return legendItem.getShape();
    }
}
