import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        NumberAxis rangeAxis = new NumberAxis("Range Axis");
        /* write */ plot.setRangeAxis(rangeAxis);
        /* read */ NumberAxis retrievedAxis = (NumberAxis) plot.getRangeAxis();
        System.out.println(retrievedAxis.getLabel());
    }
}