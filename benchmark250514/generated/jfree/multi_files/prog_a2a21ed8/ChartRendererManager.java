import org.jfree.chart.renderer.category.LineAndShapeRenderer;

public class ChartRendererManager {
    private LineAndShapeRenderer lineRenderer = new LineAndShapeRenderer();

    public void setShapeVisibility(int series, boolean visible) {
        /* write */ lineRenderer.setSeriesShapesVisible(series, visible);
    }

    public Boolean getShapeVisibility(int series) {
        return lineRenderer.getSeriesShapesVisible(series);
    }
}