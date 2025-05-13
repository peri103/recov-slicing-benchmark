import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;

public class Main {
    public static void main(String[] args) {
        CombinedDomainCategoryPlot plot = new CombinedDomainCategoryPlot();
        CategoryAxis axis = new CategoryAxis3D("Domain Axis");
        
        /* write */ plot.setDomainAxis(axis);
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        System.out.println(retrievedAxis.getLabel());
    }
}