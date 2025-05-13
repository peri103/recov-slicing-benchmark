import org.jfree.chart.renderer.AbstractRenderer;
import java.awt.Color;

public class RendererManager {
    private AbstractRenderer renderer;

    public RendererManager() {
        this.renderer = new AbstractRenderer();
    }

    public void configureRenderer() {
        // Initialize the renderer with default colors
        for (int i = 0; i < 5; i++) {
            renderer.setSeriesPaint(i, new Color(i * 50, i * 50, i * 50));
        }
    }

    public void updateSeriesPaint(int seriesIndex, Color color) {
        /* write */ renderer.setSeriesPaint(seriesIndex, color);
    }

    public AbstractRenderer getRenderer() {
        return renderer;
    }
}
