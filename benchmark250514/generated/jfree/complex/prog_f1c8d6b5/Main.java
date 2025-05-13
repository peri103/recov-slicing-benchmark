import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;

public class Main {
    public static void main(String[] args) {
        // Initialize XYPlot and set the range axis
        XYPlot plot = new XYPlot();
        NumberAxis rangeAxis = new NumberAxis("Range Axis");
        
        // Initialize CategoryPlot and set the domain axis
        CategoryPlot categoryPlot = new CategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        categoryPlot.setDomainAxis(domainAxis);
        
        // Perform some operations on categoryPlot
        if (categoryPlot.getDomainAxisCount() > 0) {
            System.out.println("Domain Axis is set.");
        }
        
        // Set the range axis for XYPlot
        /* write */ plot.setRangeAxis(rangeAxis);
        
        // More operations on categoryPlot
        categoryPlot.setDomainAxis(new CategoryAxis("New Domain Axis"));
        
        // Retrieve the range axis from XYPlot
        /* read */ NumberAxis retrievedAxis = (NumberAxis) plot.getRangeAxis();
        
        // Print the label of the range axis
        System.out.println(retrievedAxis.getLabel());
        
        // Perform additional operations on XYPlot
        NumberAxis anotherAxis = new NumberAxis("Another Axis");
        plot.setRangeAxis(1, anotherAxis);
        
        // Print details of the additional axis
        NumberAxis additionalAxis = (NumberAxis) plot.getRangeAxis(1);
        System.out.println(additionalAxis.getLabel());
    }
}