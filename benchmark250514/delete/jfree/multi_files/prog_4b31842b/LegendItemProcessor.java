import org.jfree.chart.LegendItem;

public class LegendItemProcessor {
    private LegendItemManager manager = new LegendItemManager();

    public void processLegendItems() {
        LegendItem item1 = new LegendItem("First Item");
        LegendItem item2 = new LegendItem("Second Item");
        LegendItem item3 = new LegendItem("Third Item");

        manager.addLegendItem(item1);
        manager.addLegendItem(item2);
        manager.addLegendItem(item3);

        manager.updateLegendItemLabel(0, "First Updated Item");
    }

    public String getFirstLegendItemLabel() {
        LegendItem item = manager.getLegendItem(0);
        /* read */ return item.getLabel();
    }
}
