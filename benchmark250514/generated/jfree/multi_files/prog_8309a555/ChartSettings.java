import org.jfree.chart.ChartPanel;

public class ChartSettings {
    private ChartPanel chartPanel;

    public ChartSettings(ChartPanel chartPanel) {
        this.chartPanel = chartPanel;
    }

    public void enableMouseWheel() {
        /* write */ chartPanel.setMouseWheelEnabled(true);
    }

    public boolean isMouseWheelEnabled() {
        return chartPanel.isMouseWheelEnabled();
    }
}
