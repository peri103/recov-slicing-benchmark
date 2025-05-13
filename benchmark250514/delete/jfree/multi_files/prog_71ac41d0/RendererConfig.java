import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;

public class RendererConfig {
    private XYItemRenderer renderer;

    public RendererConfig() {
        this.renderer = new StandardXYItemRenderer();
    }

    public void configureRenderer(boolean visible) {
        /* write */ renderer.setBaseShapesVisible(visible);
    }

    public XYItemRenderer getRenderer() {
        return renderer;
    }
}
