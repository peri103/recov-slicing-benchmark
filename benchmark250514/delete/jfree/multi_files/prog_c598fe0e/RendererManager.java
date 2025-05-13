import org.jfree.chart.renderer.category.LineAndShapeRenderer;

public class RendererManager {
    private LineAndShapeRenderer renderer;

    public RendererManager() {
        this.renderer = new LineAndShapeRenderer();
    }

    public void setSeriesVisibility(int seriesIndex, boolean visibility) {
        /* write */ renderer.setSeriesShapesVisible(seriesIndex, visibility);
    }

    public LineAndShapeRenderer getRenderer() {
        return this.renderer;
    }
}
