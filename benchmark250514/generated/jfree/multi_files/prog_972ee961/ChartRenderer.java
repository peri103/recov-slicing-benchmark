import org.jfree.chart.renderer.xy.XYShapeRenderer;

public class ChartRenderer {
    private XYShapeRenderer shapeRenderer = new XYShapeRenderer();

    public void configureRenderer(boolean drawOutlines) {
        /* write */ shapeRenderer.setDrawOutlines(drawOutlines);
    }

    public XYShapeRenderer getShapeRenderer() {
        return shapeRenderer;
    }
}
