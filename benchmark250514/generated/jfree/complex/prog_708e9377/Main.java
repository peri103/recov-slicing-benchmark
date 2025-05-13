import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.CategoryPlot;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        NumberAxis domainAxis = new NumberAxis("Domain Axis");
        NumberAxis rangeAxis = new NumberAxis("Range Axis");
        CategoryPlot categoryPlot = new CategoryPlot();
        
        // Set and get operations on the CategoryPlot
        categoryPlot.setRangeAxis(rangeAxis);
        ValueAxis retrievedRangeAxis = categoryPlot.getRangeAxis();
        System.out.println("CategoryPlot Range Axis: " + retrievedRangeAxis.getLabel());

        // Operations on XYPlot
        /* write */ plot.setDomainAxis(domainAxis);
        
        // Additional operations on XYPlot
        plot.setRangeAxis(rangeAxis);
        ValueAxis retrievedRangeAxisXY = plot.getRangeAxis();
        System.out.println("XYPlot Range Axis: " + retrievedRangeAxisXY.getLabel());
        
        // Simulate complex operations
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        double average = sum / data.length;
        System.out.println("Average of data: " + average);

        // Retrieve the domain axis set earlier
        /* read */ ValueAxis retrievedAxis = plot.getDomainAxis();
        
        System.out.println("XYPlot Domain Axis: " + retrievedAxis.getLabel());
    }
}