import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;

public class Main {
    public static void main(String[] args) {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("Domain Axis");

        /* write */ plot.setDomainAxis(axis);
        /* read */ CategoryAxis readAxis = plot.getDomainAxis();

        System.out.println("Domain Axis Label: " + readAxis.getLabel());
    }
}