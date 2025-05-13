import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CombinedDomainCategoryPlot plot = new CombinedDomainCategoryPlot();
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        /* write */ plot.setDomainAxis(domainAxis);
        
        CategoryPlot categoryPlot1 = new CategoryPlot();
        CategoryPlot categoryPlot2 = new CategoryPlot();
        categoryPlot1.setRangeAxis(rangeAxis);
        categoryPlot2.setRangeAxis(new NumberAxis("Another Range Axis"));
        
        ArrayList<CategoryPlot> subPlots = new ArrayList<>();
        subPlots.add(categoryPlot1);
        subPlots.add(categoryPlot2);
        
        for (CategoryPlot subPlot : subPlots) {
            System.out.println(subPlot.getRangeAxis().getLabel());
        }
        
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        System.out.println(retrievedAxis.getLabel());
        
        CategoryAxis anotherDomainAxis = new CategoryAxis("Another Domain Axis");
        CombinedDomainCategoryPlot anotherPlot = new CombinedDomainCategoryPlot();
        anotherPlot.setDomainAxis(anotherDomainAxis);
        
        CategoryAxis axisFromAnotherPlot = anotherPlot.getDomainAxis();
        System.out.println(axisFromAnotherPlot.getLabel());
    }
}