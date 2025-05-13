import org.jfree.chart.LegendItem;

public class LegendManager {
    private LegendItem legendItem;

    public LegendManager(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setSeriesKey(String key) {
        /* write */ legendItem.setSeriesKey(key);
    }

    public Object getSeriesKey() {
        return legendItem.getSeriesKey();
    }
}
