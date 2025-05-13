import org.jfree.chart.ChartPanel;

public class ChartReader {
    private ChartPanel chartPanel;

    public ChartReader(ChartPanel chartPanel) {
        this.chartPanel = chartPanel;
    }

    public boolean isMouseWheelEnabled() {
        /* read */ return chartPanel.isMouseWheelEnabled();
    }
}
