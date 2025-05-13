import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot and set the label generator
        PiePlot piePlot = new PiePlot();
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        // Initialize CategoryPlot with NumberAxis and BarRenderer
        NumberAxis numberAxis = new NumberAxis("Value");
        BarRenderer barRenderer = new BarRenderer();
        CategoryPlot categoryPlot = new CategoryPlot(null, null, numberAxis, barRenderer);
        
        // Perform operations on CategoryPlot
        categoryPlot.setRangeGridlinesVisible(true);
        categoryPlot.setRangeGridlinePaint(java.awt.Color.BLUE);
        
        /* write */ piePlot.setLabelGenerator(labelGenerator);
        
        // Additional operations on PiePlot
        piePlot.setCircular(true);
        piePlot.setSectionOutlinesVisible(false);
        
        // More operations on CategoryPlot
        categoryPlot.setDomainGridlinesVisible(true);
        categoryPlot.setDomainGridlinePaint(java.awt.Color.RED);
        
        // Retrieve and check the label generator
        /* read */ PieSectionLabelGenerator retrievedLabelGenerator = piePlot.getLabelGenerator();
        
        // Print to verify the label generator
        System.out.println(retrievedLabelGenerator.equals(labelGenerator)); // Should print true
        
        // Additional code to manipulate and display PiePlot properties
        piePlot.setExplodePercent("Category 1", 0.1);
        piePlot.setExplodePercent("Category 2", 0.2);
        
        // Print some properties of the PiePlot
        System.out.println("Is Pie Circular: " + piePlot.isCircular());
        System.out.println("Section Outlines Visible: " + piePlot.getSectionOutlinesVisible());
    }
}