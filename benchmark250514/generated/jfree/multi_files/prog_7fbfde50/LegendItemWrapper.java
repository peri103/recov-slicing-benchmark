import org.jfree.chart.LegendItem;

public class LegendItemWrapper {
    private LegendItem legendItem;

    public LegendItemWrapper(String label) {
        this.legendItem = new LegendItem(label);
    }

    public void setSeriesIndex(int index) {
        /* write */ legendItem.setSeriesIndex(index);
    }

    public int getSeriesIndex() {
        return legendItem.getSeriesIndex();
    }
}
