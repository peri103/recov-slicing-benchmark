import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;

public class Main {
    public static void main(String[] args) {
        AxisManager axisManager = new AxisManager();
        NumberAxis domainAxis = new NumberAxis("Domain Axis");
        axisManager.setDomainAxis(domainAxis);

        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        DataAnalyzer analyzer = new DataAnalyzer(data);
        double average = analyzer.calculateAverage();
        System.out.println("Average of data: " + average);

        XYPlot plot = axisManager.getPlot();
        /* read */ ValueAxis retrievedAxis = plot.getDomainAxis();
        
        System.out.println("XYPlot Domain Axis: " + retrievedAxis.getLabel());
    }
}