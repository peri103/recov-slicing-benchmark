import org.jfree.chart.renderer.xy.XYShapeRenderer;

public class ShapeRendererConfig {
    private XYShapeRenderer renderer = new XYShapeRenderer();

    public void configureRenderer(boolean drawOutlines) {
        /* write */ renderer.setDrawOutlines(drawOutlines);
    }

    public XYShapeRenderer getRenderer() {
        return renderer;
    }
}
