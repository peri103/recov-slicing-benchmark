import org.jfree.chart.LegendItem;

public class LegendManager {
    private LegendItem legendItem;

    public LegendManager(String initialLabel) {
        this.legendItem = new LegendItem(initialLabel);
    }

    public void updateLabel(String newLabel) {
        /* write */ legendItem.setLabel(newLabel);
    }

    public String retrieveLabel() {
        return legendItem.getLabel();
    }
}
