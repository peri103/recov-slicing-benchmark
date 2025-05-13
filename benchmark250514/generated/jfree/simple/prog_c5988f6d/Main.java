import org.jfree.chart.ChartPanel;

public class Main {
    public static void main(String[] args) {
        ChartPanel chartPanel = new ChartPanel(null);
        /* write */ chartPanel.setMouseWheelEnabled(true);
        /* read */ boolean isMouseWheelEnabled = chartPanel.isMouseWheelEnabled();
        System.out.println(isMouseWheelEnabled);
    }
}