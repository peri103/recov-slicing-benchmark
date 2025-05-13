import org.jfree.chart.LegendItem;

public class LegendItemManager {
    private LegendItem legendItem;

    public LegendItemManager(String initialLabel) {
        this.legendItem = new LegendItem(initialLabel);
    }

    public void updateLabel(String newLabel) {
        /* write */ legendItem.setLabel(newLabel);
    }

    public String getLabel() {
        return legendItem.getLabel();
    }
}
