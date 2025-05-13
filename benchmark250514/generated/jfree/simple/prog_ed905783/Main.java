import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis axis = new NumberAxis("Range Axis");
        
        /* write */ plot.setRangeAxis(axis);
        /* read */ ValueAxis readAxis = plot.getRangeAxis();
        
        System.out.println("Range Axis: " + readAxis.getLabel());
    }
}