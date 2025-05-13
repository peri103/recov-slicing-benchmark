import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        XYPlot xyPlot = new XYPlot();

        /* write */ piePlot.setLabelPaint(Color.RED);
        
        // Additional operations on PiePlot
        piePlot.setLabelFont(new Font("Arial", Font.BOLD, 12));
        piePlot.setSectionPaint("Section1", Color.BLUE);
        
        // Operations on CategoryPlot
        categoryPlot.setDomainGridlinePaint(Color.GREEN);
        categoryPlot.setRangeGridlinePaint(Color.YELLOW);
        
        // Operations on XYPlot
        xyPlot.setDomainCrosshairPaint(Color.BLACK);
        xyPlot.setRangeCrosshairPaint(Color.MAGENTA);

        // More complex logic using the plots
        Color domainGridlinePaint = categoryPlot.getDomainGridlinePaint();
        Color rangeGridlinePaint = categoryPlot.getRangeGridlinePaint();
        System.out.println("CategoryPlot Domain Gridline Paint: " + domainGridlinePaint);
        System.out.println("CategoryPlot Range Gridline Paint: " + rangeGridlinePaint);
        
        Color domainCrosshairPaint = xyPlot.getDomainCrosshairPaint();
        Color rangeCrosshairPaint = xyPlot.getRangeCrosshairPaint();
        System.out.println("XYPlot Domain Crosshair Paint: " + domainCrosshairPaint);
        System.out.println("XYPlot Range Crosshair Paint: " + rangeCrosshairPaint);

        // Complex logic using PiePlot
        Font labelFont = piePlot.getLabelFont();
        System.out.println("PiePlot Label Font: " + labelFont);

        /* read */ Color labelPaint = (Color) piePlot.getLabelPaint();
        
        System.out.println("PiePlot Label Paint: " + labelPaint);
    }
}