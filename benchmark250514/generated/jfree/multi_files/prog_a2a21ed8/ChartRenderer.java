import org.jfree.chart.renderer.category.LineAndShapeRenderer;

public class ChartRenderer {
    private LineAndShapeRenderer lineRenderer;

    public ChartRenderer() {
        this.lineRenderer = new LineAndShapeRenderer();
    }

    public void setSeriesShapesVisible(int series, boolean visible) {
        /* write */ lineRenderer.setSeriesShapesVisible(series, visible);
    }

    public LineAndShapeRenderer getLineRenderer() {
        return this.lineRenderer;
    }
}
