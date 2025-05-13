import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;

public class Main {
    public static void main(String[] args) {
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer = new DefaultCategoryItemRenderer();
        
        /* write */ plot.setRenderer(renderer);
        /* read */ CategoryItemRenderer readRenderer = plot.getRenderer();
        
        System.out.println(readRenderer);
    }
}