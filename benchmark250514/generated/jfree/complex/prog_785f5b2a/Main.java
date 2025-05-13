import org.jfree.chart.plot.PiePlot;
import java.awt.BasicStroke;
import java.awt.Stroke;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot and set a section outline stroke
        PiePlot piePlot = new PiePlot();
        Stroke stroke = new BasicStroke(2.0f);
        /* write */ piePlot.setSectionOutlineStroke("Section1", stroke);
        
        // Initialize CategoryPlot and configure its range axis
        CategoryPlot categoryPlot = new CategoryPlot();
        NumberAxis rangeAxis = new NumberAxis("Values");
        rangeAxis.setLowerMargin(0.10);
        rangeAxis.setUpperMargin(0.10);
        categoryPlot.setRangeAxis(rangeAxis);
        
        // Perform some operations with CategoryPlot
        categoryPlot.getRangeAxis().setTickLabelsVisible(true);
        Stroke categoryStroke = new BasicStroke(1.5f);
        categoryPlot.setDomainGridlineStroke(categoryStroke);
        
        // More operations with PiePlot
        piePlot.setSectionOutlinePaint("Section1", java.awt.Color.RED);
        piePlot.setSectionPaint("Section2", java.awt.Color.BLUE);
        
        // Retrieve the stroke from PiePlot
        /* read */ Stroke readStroke = piePlot.getSectionOutlineStroke("Section1");
        
        // Print the stroke to verify
        System.out.println("PiePlot Section1 Stroke: " + readStroke);
        
        // Additional operations and logic
        Stroke newStroke = new BasicStroke(3.0f);
        piePlot.setSectionOutlineStroke("Section2", newStroke);
        Stroke retrievedStroke = piePlot.getSectionOutlineStroke("Section2");
        System.out.println("PiePlot Section2 Stroke: " + retrievedStroke);
        
        // Print details about CategoryPlot
        System.out.println("CategoryPlot Range Axis Lower Margin: " + categoryPlot.getRangeAxis().getLowerMargin());
        System.out.println("CategoryPlot Domain Gridline Stroke: " + categoryPlot.getDomainGridlineStroke());
    }
}