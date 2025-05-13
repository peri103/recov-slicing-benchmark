import org.jfree.chart.ChartPanel;

public class ChartMouseSettings {
    private ChartPanel chartPanel;

    public ChartMouseSettings(ChartPanel chartPanel) {
        this.chartPanel = chartPanel;
    }

    public void enableMouseWheel() {
        /* write */ chartPanel.setMouseWheelEnabled(true);
    }
}
