import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.plot.Plot;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        XYPlot xyPlot = new XYPlot();

        /* write */ piePlot.setMaximumLabelWidth(0.2);
        
        // Unrelated operations on CategoryPlot
        categoryPlot.setDomainGridlinesVisible(true);
        categoryPlot.setRangeGridlinesVisible(false);
        
        // Operations on XYPlot
        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(true);
        
        // More operations on PiePlot
        piePlot.setInteriorGap(0.05);
        piePlot.setCircular(true);
        
        // Operations on a generic Plot object
        Plot genericPlot = piePlot;
        genericPlot.setOutlineVisible(true);
        
        // Additional unrelated code
        double totalWidth = 0;
        for (int i = 0; i < 3; i++) {
            totalWidth += piePlot.getMaximumLabelWidth();
        }
        
        /* read */ double maxLabelWidth = piePlot.getMaximumLabelWidth();
        System.out.println(maxLabelWidth);
        
        // Further operations on XYPlot
        xyPlot.setDomainPannable(true);
        xyPlot.setRangePannable(false);
        
        // Print statements for unrelated plots
        System.out.println("CategoryPlot domain gridlines visible: " + categoryPlot.isDomainGridlinesVisible());
        System.out.println("XYPlot domain crosshair visible: " + xyPlot.isDomainCrosshairVisible());
    }
}