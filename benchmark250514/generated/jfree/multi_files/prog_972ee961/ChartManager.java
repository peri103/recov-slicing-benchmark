import org.jfree.chart.renderer.xy.XYShapeRenderer;

public class ChartManager {
    private ShapeRendererConfig config = new ShapeRendererConfig();

    public void setupRenderer() {
        config.configureRenderer(true);
    }

    public boolean checkDrawOutlines() {
        XYShapeRenderer renderer = config.getRenderer();
        /* read */ return renderer.getDrawOutlines();
    }
}
