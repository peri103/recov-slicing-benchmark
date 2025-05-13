import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItemManager legendManager = new LegendItemManager("Initial Label");
        legendManager.updateLabel("Updated Label");

        ArrayList<LegendItemManager> legendManagers = new ArrayList<>();
        legendManagers.add(new LegendItemManager("Item 1"));
        legendManagers.add(new LegendItemManager("Item 2"));
        legendManagers.add(legendManager);

        PlotManager plotManager = new PlotManager();
        plotManager.configurePlot();

        for (LegendItemManager manager : legendManagers) {
            System.out.println("Legend Item: " + manager.getLabel());
        }

        /* read */ String finalLabel = legendManager.getLabel();
        System.out.println("Final Label: " + finalLabel);

        for (int i = 0; i < legendManagers.size(); i++) {
            LegendItemManager manager = legendManagers.get(i);
            manager.updateLabel("Item " + (i + 1) + " Updated");
            System.out.println("Updated Legend Item: " + manager.getLabel());
        }
    }
}