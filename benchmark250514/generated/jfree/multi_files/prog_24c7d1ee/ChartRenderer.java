import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class ChartRenderer {
    private XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();

    public void configureLineVisibility(int seriesIndex, boolean visible) {
        /* write */ lineRenderer.setSeriesLinesVisible(seriesIndex, visible);
    }

    public Boolean isLineVisible(int seriesIndex) {
        return lineRenderer.getSeriesLinesVisible(seriesIndex);
    }
}