import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize XYPlot and CategoryPlot
        XYPlot xyPlot = new XYPlot();
        CategoryPlot categoryPlot = new CategoryPlot();

        // Create a NumberAxis instance to set as the range axis for XYPlot
        ValueAxis rangeAxisXY = new NumberAxis("Range Axis XY");
        /* write */ xyPlot.setRangeAxis(rangeAxisXY);

        // Create a CategoryAxis instance to set as the domain axis for CategoryPlot
        CategoryAxis domainAxisCategory = new CategoryAxis("Domain Axis Category");
        categoryPlot.setDomainAxis(domainAxisCategory);

        // Perform various operations on CategoryPlot
        ValueAxis rangeAxisCategory = new NumberAxis("Range Axis Category");
        categoryPlot.setRangeAxis(rangeAxisCategory);
        CategoryAxis retrievedDomainAxis = categoryPlot.getDomainAxis();
        System.out.println("Retrieved Domain Axis Label: " + retrievedDomainAxis.getLabel());

        // Perform operations on XYPlot
        ValueAxis anotherRangeAxisXY = new NumberAxis("Another Range Axis XY");
        xyPlot.setRangeAxis(1, anotherRangeAxisXY);
        
        // Retrieve the range axis from XYPlot
        /* read */ ValueAxis retrievedAxisXY = xyPlot.getRangeAxis();
        System.out.println("Retrieved Axis Label from XYPlot: " + retrievedAxisXY.getLabel());
        
        // Additional operations on XYPlot
        ValueAxis retrievedAnotherAxisXY = xyPlot.getRangeAxis(1);
        System.out.println("Retrieved Another Axis Label from XYPlot: " + retrievedAnotherAxisXY.getLabel());
    }
}