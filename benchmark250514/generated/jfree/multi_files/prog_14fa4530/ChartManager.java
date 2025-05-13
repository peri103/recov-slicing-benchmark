import java.util.HashMap;

public class ChartManager {
    private HashMap<String, ChartSettings> charts = new HashMap<>();

    public void addChart(String name, ChartSettings settings) {
        charts.put(name, settings);
    }

    public ChartSettings getChart(String name) {
        return charts.get(name);
    }

    public void printAllLabelWidths() {
        for (String name : charts.keySet()) {
            double width = charts.get(name).getPlot().getMaximumLabelWidth();
            System.out.println("Label width for " + name + ": " + width);
        }
    }
}
