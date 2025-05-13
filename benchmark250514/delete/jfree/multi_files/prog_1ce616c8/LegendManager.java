import org.jfree.chart.LegendItem;
import java.awt.Shape;
import java.util.ArrayList;

public class LegendManager {
    private ArrayList<LegendItem> legendItems = new ArrayList<>();

    public void addLegendItem(LegendItem item) {
        legendItems.add(item);
    }

    public LegendItem getLegendItem(int index) {
        return legendItems.get(index);
    }

    public ArrayList<LegendItem> getLegendItems() {
        return legendItems;
    }
}
