import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class LegendItemManager {
    private ArrayList<LegendItem> legendItems = new ArrayList<>();

    public void addLegendItem(String label, Shape shape) {
        LegendItem legendItem = new LegendItem(label);
        legendItem.setShape(shape);
        /* write */ legendItems.add(legendItem);
    }

    public LegendItem getLegendItem(int index) {
        return legendItems.get(index);
    }

    public ArrayList<LegendItem> getAllLegendItems() {
        return legendItems;
    }
}
