import org.jfree.chart.plot.Plot;
import java.awt.Color;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYItemRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize a custom plot
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "CustomPlot";
            }
        };

        // Create an XYPlot with axis and renderer
        NumberAxis xAxis = new NumberAxis("X-Axis");
        NumberAxis yAxis = new NumberAxis("Y-Axis");
        XYItemRenderer renderer = new XYItemRenderer() {
            @Override
            public void drawItem(java.awt.Graphics2D g2, XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int pass) {
                // Custom rendering logic
            }
        };
        XYPlot xyPlot = new XYPlot(null, xAxis, yAxis, renderer);

        // Set background paint for the plot
        /* write */ plot.setBackgroundPaint(Color.BLUE);

        // Perform other operations on XYPlot
        xyPlot.setDomainGridlinesVisible(true);
        xyPlot.setRangeGridlinesVisible(true);
        xyPlot.setDomainCrosshairVisible(false);
        xyPlot.setRangeCrosshairVisible(true);

        // Additional operations
        xAxis.setAutoRangeIncludesZero(false);
        yAxis.setLowerMargin(0.02);
        yAxis.setUpperMargin(0.02);

        // Retrieve and print background paint color
        /* read */ Color backgroundPaint = (Color) plot.getBackgroundPaint();
        System.out.println("Background paint color: " + backgroundPaint.toString());

        // Further operations
        xyPlot.setDomainCrosshairLockedOnData(false);
        xyPlot.setRangeCrosshairLockedOnData(true);
        
        // Final adjustments
        xAxis.setTickLabelsVisible(true);
        yAxis.setTickLabelsVisible(true);
    }
}