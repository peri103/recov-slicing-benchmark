import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.ChartFactory;

public class Main {
    public static void main(String[] args) {
        // Create a simple XY chart
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 2.5);
        
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Sample Chart",
            "X",
            "Y",
            dataset
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        ChartPanel anotherChartPanel = new ChartPanel(chart);
        
        /* write */ chartPanel.setMouseWheelEnabled(true);
        
        // Additional operations on anotherChartPanel
        anotherChartPanel.setMouseWheelEnabled(false);
        boolean anotherPanelMouseWheel = anotherChartPanel.isMouseWheelEnabled();
        System.out.println("Another panel mouse wheel enabled: " + anotherPanelMouseWheel);

        // Manipulate the chart's plot
        Plot plot = chart.getPlot();
        if (plot instanceof XYPlot) {
            XYPlot xyPlot = (XYPlot) plot;
            xyPlot.setDomainCrosshairVisible(true);
            xyPlot.setRangeCrosshairVisible(true);
        }

        // Perform some calculations
        double total = 0;
        for (int i = 0; i < series.getItemCount(); i++) {
            total += series.getY(i).doubleValue();
        }
        double average = total / series.getItemCount();
        System.out.println("Average value: " + average);

        /* read */ boolean isMouseWheelEnabled = chartPanel.isMouseWheelEnabled();
        System.out.println("Original panel mouse wheel enabled: " + isMouseWheelEnabled);
    }
}