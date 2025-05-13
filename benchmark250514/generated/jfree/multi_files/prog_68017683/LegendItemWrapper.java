import org.jfree.chart.LegendItem;

public class LegendItemWrapper {
    private LegendItem legendItem;

    public LegendItemWrapper(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setLineVisible(boolean visible) {
        /* write */ legendItem.setLineVisible(visible);
    }

    public boolean isLineVisible() {
        return legendItem.isLineVisible();
    }
}