import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.AxisLocation;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        
        // Initialize the Paint object for shadow
        Paint shadowPaint = Color.GRAY;
        
        /* write */ piePlot.setShadowPaint(shadowPaint);
        
        // Create and configure a CategoryPlot
        CategoryPlot categoryPlot = new CategoryPlot();
        NumberAxis rangeAxis = new NumberAxis("Value");
        categoryPlot.setRangeAxis(rangeAxis);
        categoryPlot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        
        // Modify the range axis
        rangeAxis.setAutoRangeIncludesZero(false);
        rangeAxis.setLowerMargin(0.10);
        rangeAxis.setUpperMargin(0.10);
        
        // Print out axis details
        System.out.println("Range Axis Lower Margin: " + rangeAxis.getLowerMargin());
        System.out.println("Range Axis Upper Margin: " + rangeAxis.getUpperMargin());
        
        // Perform some operations on the CategoryPlot
        categoryPlot.setDomainGridlinesVisible(true);
        categoryPlot.setRangeGridlinesVisible(true);
        
        // Retrieve and print shadow paint from PiePlot
        /* read */ Paint retrievedShadowPaint = piePlot.getShadowPaint();
        System.out.println("Retrieved Shadow Paint: " + retrievedShadowPaint);
        
        // Additional operations on PiePlot
        piePlot.setSectionOutlinesVisible(false);
        piePlot.setLabelGap(0.02);
        
        // Print out PiePlot details
        System.out.println("Section Outlines Visible: " + piePlot.getSectionOutlinesVisible());
        System.out.println("Label Gap: " + piePlot.getLabelGap());
    }
}