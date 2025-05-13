import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new XYLineAndShapeRenderer();
        
        /* write */ renderer.setBaseShapesVisible(true);
        
        // Create a simple XY dataset
        XYSeries series = new XYSeries("Series1");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.random() * 100);
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create an XY plot
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        // Create a chart using the plot
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Perform some operations on the chart
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);
        renderer.setBaseShapesFilled(true);
        
        // Additional operations on the renderer
        renderer.setSeriesPaint(0, java.awt.Color.BLUE);
        
        /* read */ boolean isVisible = renderer.getBaseShapesVisible();
        
        System.out.println("Base shapes visible: " + isVisible);
        
        // Further operations on the dataset
        XYSeries series2 = new XYSeries("Series2");
        for (int i = 0; i < 10; i++) {
            series2.add(i, Math.random() * 100);
        }
        dataset.addSeries(series2);
        
        // Perform operations on the plot
        plot.setDataset(dataset);
        plot.setOutlineVisible(true);
        
        // Print some information about the plot
        System.out.println("Domain axis: " + plot.getDomainAxis().getLabel());
        System.out.println("Range axis: " + plot.getRangeAxis().getLabel());
    }
}