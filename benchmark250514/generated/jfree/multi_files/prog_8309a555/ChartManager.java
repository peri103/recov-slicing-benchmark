import org.jfree.chart.ChartPanel;
import java.util.ArrayList;

public class ChartManager {
    private ArrayList<ChartSettings> chartSettingsList = new ArrayList<>();

    public void addChart(ChartPanel chartPanel) {
        chartSettingsList.add(new ChartSettings(chartPanel));
    }

    public ChartSettings getChartSettings(int index) {
        return chartSettingsList.get(index);
    }
}
