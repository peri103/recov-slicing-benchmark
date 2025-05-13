import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        NumberAxis numberAxis = new NumberAxis();
        CategoryAxis categoryAxis = new CategoryAxis();
        BarRenderer barRenderer = new BarRenderer();
        
        // Configure CategoryPlot
        categoryPlot.setDomainAxis(categoryAxis);
        categoryPlot.setRangeAxis(numberAxis);
        categoryPlot.setRenderer(barRenderer);
        
        // Set properties for PiePlot
        piePlot.setCircular(true);
        piePlot.setIgnoreNullValues(true);
        
        // Set properties for BarRenderer
        barRenderer.setBaseOutlineStroke(new java.awt.BasicStroke(1.5f));
        barRenderer.setDrawBarOutline(true);
        
        // Set properties for NumberAxis
        numberAxis.setAutoRangeIncludesZero(false);
        numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        // Set properties for CategoryAxis
        categoryAxis.setCategoryMargin(0.2);
        
        /* write */ piePlot.setSectionOutlinesVisible(true);
        
        // Additional operations
        boolean circular = piePlot.isCircular();
        boolean ignoreNulls = piePlot.getIgnoreNullValues();
        System.out.println("PiePlot is circular: " + circular);
        System.out.println("PiePlot ignores null values: " + ignoreNulls);
        
        // More operations on CategoryPlot
        categoryPlot.setDomainGridlinesVisible(true);
        categoryPlot.setRangeGridlinesVisible(true);
        
        // Read the property set earlier
        /* read */ boolean isVisible = piePlot.getSectionOutlinesVisible();
        System.out.println("Section outlines visible: " + isVisible);
        
        // Further operations
        barRenderer.setItemMargin(0.1);
        categoryPlot.setBackgroundPaint(java.awt.Color.LIGHT_GRAY);
        
        // Print some final values
        System.out.println("BarRenderer item margin: " + barRenderer.getItemMargin());
        System.out.println("CategoryPlot background paint: " + categoryPlot.getBackgroundPaint());
    }
}