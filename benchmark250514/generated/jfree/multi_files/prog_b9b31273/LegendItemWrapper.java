import org.jfree.chart.LegendItem;
import java.awt.Shape;

public class LegendItemWrapper {
    private LegendItem legendItem;

    public LegendItemWrapper(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setShape(Shape shape) {
        /* write */ legendItem.setShape(shape);
    }

    public Shape getShape() {
        return legendItem.getShape();
    }

    public String getLabel() {
        return legendItem.getLabel();
    }
}
