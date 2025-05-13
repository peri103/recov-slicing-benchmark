import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        ValueAxis axis = new NumberAxis("Range Axis");
        
        /* write */ plot.setRangeAxis(axis);
        
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        System.out.println(retrievedAxis.getLabel());
    }
}