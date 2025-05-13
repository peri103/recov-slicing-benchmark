import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        JFreeChart chart = new JFreeChart(null); // Placeholder for the chart object
        ChartPanel panel = new ChartPanel(chart);
        
        /* write */ panel.setMouseWheelEnabled(true);
        /* read */ boolean isMouseWheelEnabled = panel.isMouseWheelEnabled();
        
        System.out.println(isMouseWheelEnabled);
    }
}