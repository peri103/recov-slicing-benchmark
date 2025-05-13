import org.jfree.chart.renderer.xy.XYShapeRenderer;

public class RendererConfig {
    private XYShapeRenderer renderer;

    public RendererConfig() {
        this.renderer = new XYShapeRenderer();
    }

    public void configureRenderer(boolean drawOutlines) {
        /* write */ renderer.setDrawOutlines(drawOutlines);
    }

    public XYShapeRenderer getRenderer() {
        return renderer;
    }
}
