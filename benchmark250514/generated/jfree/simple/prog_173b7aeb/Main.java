import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, null, false);
        ChartPanel chartPanel = new ChartPanel(null);
        
        /* write */ chartPanel.setChart(chart);
        /* read */ JFreeChart retrievedChart = chartPanel.getChart();
        
        System.out.println(retrievedChart.getTitle().getText());
    }
}