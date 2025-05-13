import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.BarRenderer;

public class ChartRenderer {
    private CategoryItemRenderer renderer;

    public ChartRenderer() {
        renderer = new BarRenderer(); // Default renderer
    }

    public void setCustomRenderer(CategoryItemRenderer customRenderer) {
        /* write */ this.renderer = customRenderer;
    }

    public CategoryItemRenderer getRenderer() {
        return renderer;
    }
}