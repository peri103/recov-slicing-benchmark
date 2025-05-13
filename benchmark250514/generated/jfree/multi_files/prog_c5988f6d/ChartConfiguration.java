import org.jfree.chart.ChartPanel;

public class ChartConfiguration {
    private ChartPanel chartPanel;

    public ChartConfiguration(ChartPanel chartPanel) {
        this.chartPanel = chartPanel;
    }

    public void enableMouseWheel() {
        /* write */ chartPanel.setMouseWheelEnabled(true);
    }

    public boolean isMouseWheelEnabled() {
        return chartPanel.isMouseWheelEnabled();
    }
}
