import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        NumberAxis numberAxis = new NumberAxis();

        // Set up the category plot with an axis
        categoryPlot.setDomainAxis(numberAxis);
        
        // Additional setup for category plot
        categoryPlot.setRangeGridlinesVisible(true);
        categoryPlot.setDomainGridlinesVisible(false);
        
        // Configure the axis
        numberAxis.setAutoRangeIncludesZero(false);
        numberAxis.setLabel("Sample Axis");
        
        // Perform operations on the category plot
        boolean gridlinesVisible = categoryPlot.isRangeGridlinesVisible();
        System.out.println("Range Gridlines Visible: " + gridlinesVisible);

        // Perform operations on the pie plot
        /* write */ piePlot.setSectionOutlinesVisible(true);
        
        // Perform other unrelated operations
        categoryPlot.setRangeCrosshairVisible(true);
        boolean crosshairVisible = categoryPlot.isRangeCrosshairVisible();
        System.out.println("Range Crosshair Visible: " + crosshairVisible);

        // More unrelated operations
        numberAxis.setUpperMargin(0.10);
        double upperMargin = numberAxis.getUpperMargin();
        System.out.println("Upper Margin: " + upperMargin);

        // Read the value from pie plot
        /* read */ boolean isSectionOutlinesVisible = piePlot.getSectionOutlinesVisible();
        System.out.println("Section Outlines Visible: " + isSectionOutlinesVisible);
    }
}