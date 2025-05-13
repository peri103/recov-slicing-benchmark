import org.jfree.chart.LegendItem;

public class LegendItemVisibility {
    private LegendItem legendItem;

    public LegendItemVisibility(LegendItem legendItem) {
        this.legendItem = legendItem;
    }

    public void setVisibility(boolean visible) {
        /* write */ legendItem.setShapeVisible(visible);
    }

    public boolean getVisibility() {
        return legendItem.isShapeVisible();
    }
}
