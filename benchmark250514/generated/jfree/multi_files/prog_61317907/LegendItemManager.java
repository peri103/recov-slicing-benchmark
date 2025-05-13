import org.jfree.chart.LegendItem;

public class LegendItemManager {
    private LegendItem legendItem;

    public LegendItemManager(String description) {
        this.legendItem = new LegendItem(description);
    }

    public void setLineVisibility(boolean visibility) {
        /* write */ legendItem.setLineVisible(visibility);
    }

    public boolean isLineVisible() {
        return legendItem.isLineVisible();
    }
}