import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;

public class RendererManager {
    private XYLineAndShapeRenderer lineAndShapeRenderer;
    private XYBarRenderer barRenderer;

    public RendererManager() {
        this.lineAndShapeRenderer = new XYLineAndShapeRenderer();
        this.barRenderer = new XYBarRenderer();
    }

    public void configureRenderers() {
        lineAndShapeRenderer.setSeriesShapesVisible(0, false);
        barRenderer.setSeriesVisible(0, true);
    }

    public boolean isLineAndShapeRendererSeriesVisible(int series) {
        return lineAndShapeRenderer.getSeriesShapesVisible(series);
    }

    public Boolean isBarRendererSeriesVisible(int series) {
        return barRenderer.getSeriesVisible(series);
    }
}
