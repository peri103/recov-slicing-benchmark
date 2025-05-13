import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;

public class Main {
    public static void main(String[] args) {
        CombinedRangeXYPlot combinedPlot = new CombinedRangeXYPlot();
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        /* write */ combinedPlot.setRangeAxis(rangeAxis);
        
        CategoryAxis categoryAxis = new CategoryAxis("Category Axis");
        CategoryPlot categoryPlot = new CategoryPlot();
        categoryPlot.setDomainAxis(categoryAxis);
        
        ValueAxis anotherAxis = new NumberAxis("Another Axis");
        combinedPlot.setRangeAxis(1, anotherAxis);
        
        int numberOfAxes = combinedPlot.getRangeAxisCount();
        System.out.println("Number of Range Axes: " + numberOfAxes);
        
        ValueAxis domainAxis = categoryPlot.getDomainAxis();
        System.out.println("Domain Axis Label: " + domainAxis.getLabel());
        
        /* read */ ValueAxis readAxis = combinedPlot.getRangeAxis();
        System.out.println("Range Axis Label: " + readAxis.getLabel());
        
        ValueAxis axisFromIndex = combinedPlot.getRangeAxis(1);
        System.out.println("Axis from Index 1 Label: " + axisFromIndex.getLabel());
        
        categoryPlot.setRangeAxis(new NumberAxis("New Category Range Axis"));
        ValueAxis categoryRangeAxis = categoryPlot.getRangeAxis();
        System.out.println("Category Range Axis Label: " + categoryRangeAxis.getLabel());
    }
}