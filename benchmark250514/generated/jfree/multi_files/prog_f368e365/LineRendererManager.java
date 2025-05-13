import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.util.ArrayList;

public class LineRendererManager {
    private XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();

    public void configureRenderer(int seriesIndex, boolean linesVisible, boolean shapesVisible) {
        lineRenderer.setSeriesLinesVisible(seriesIndex, linesVisible);
        lineRenderer.setSeriesShapesVisible(seriesIndex, shapesVisible);
    }

    public void setSeriesColor(int seriesIndex, int red, int green, int blue) {
        lineRenderer.setSeriesPaint(seriesIndex, new java.awt.Color(red, green, blue));
    }

    public int calculateSum(ArrayList<Integer> values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}
