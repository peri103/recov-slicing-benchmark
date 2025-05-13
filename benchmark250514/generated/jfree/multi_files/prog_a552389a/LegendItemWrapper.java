import org.jfree.chart.LegendItem;
import java.awt.Color;

public class LegendItemWrapper {
    private LegendItem legendItem;

    public LegendItemWrapper(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setLinePaint(Color color) {
        /* write */ legendItem.setLinePaint(color);
    }

    public Color getLinePaint() {
        return (Color) legendItem.getLinePaint();
    }

    public String getLabel() {
        return legendItem.getLabel();
    }
}
