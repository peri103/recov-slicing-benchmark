import java.awt.Font;
import org.jfree.chart.LegendItem;

public class LegendItemWrapper {
    private LegendItem legendItem;

    public LegendItemWrapper(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setLabelFont(Font font) {
        /* write */ legendItem.setLabelFont(font);
    }

    public Font getLabelFont() {
        return legendItem.getLabelFont();
    }
}