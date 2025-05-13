import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        CategoryPlot plot = new CategoryPlot();
        CategoryAxis axis = new CategoryAxis("Domain Axis");

        /* write */ plot.setDomainAxis(axis);
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();

        System.out.println(retrievedAxis.getLabel());
    }
}