import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;

public class Main {
    public static void main(String[] args) {
        CombinedDomainCategoryPlot plot = new CombinedDomainCategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        
        /* write */ plot.setDomainAxis(domainAxis);
        
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        System.out.println(retrievedAxis.getLabel());
    }
}