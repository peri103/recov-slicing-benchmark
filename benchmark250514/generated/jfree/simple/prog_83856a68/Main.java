import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        CombinedRangeXYPlot plot = new CombinedRangeXYPlot();
        NumberAxis rangeAxis = new NumberAxis("Range Axis");
        
        /* write */ plot.setRangeAxis(rangeAxis);
        /* read */ NumberAxis readAxis = (NumberAxis) plot.getRangeAxis();
        
        System.out.println("Range Axis Label: " + readAxis.getLabel());
    }
}