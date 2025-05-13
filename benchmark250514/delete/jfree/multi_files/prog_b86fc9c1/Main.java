import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;

public class Main {
    public static void main(String[] args) {
        CategoryPlotManager plotManager = new CategoryPlotManager();
        
        // Configure the plot with various settings
        plotManager.configurePlot();
        
        // Initialize a CategoryAxis object to set
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        
        // Use DomainAxisManager to set the domain axis
        DomainAxisManager domainAxisManager = plotManager.getDomainAxisManager();
        domainAxisManager.setDomainAxis(domainAxis);
        
        // Retrieve the domain axis and output its label
        /* read */ CategoryAxis retrievedAxis = domainAxisManager.getDomainAxis();
        System.out.println(retrievedAxis.getLabel());
    }
}