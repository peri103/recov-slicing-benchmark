import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        
        // Create a NumberAxis instance to set as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        /* write */ plot.setRangeAxis(rangeAxis);
        
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());
    }
}