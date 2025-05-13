import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        /* write */ plot.setRangeAxis(rangeAxis);
        
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        System.out.println("Axis Label: " + retrievedAxis.getLabel());
    }
}