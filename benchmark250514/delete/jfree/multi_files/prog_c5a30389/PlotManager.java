import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;

public class PlotManager {
    private CategoryPlot plot = new CategoryPlot();

    public void setCustomRenderer(CategoryItemRenderer renderer) {
        /* write */ plot.setRenderer(renderer);
    }

    public CategoryItemRenderer getRenderer() {
        return plot.getRenderer();
    }
}
