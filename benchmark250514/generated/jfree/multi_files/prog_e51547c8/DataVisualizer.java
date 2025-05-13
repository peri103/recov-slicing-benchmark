import org.jfree.chart.renderer.xy.XYAreaRenderer;

public class DataVisualizer {
    private XYAreaRenderer areaRenderer;

    public DataVisualizer() {
        this.areaRenderer = new XYAreaRenderer();
    }

    public void configureRenderer() {
        areaRenderer.setSeriesPaint(0, null);
        areaRenderer.setSeriesOutlineStroke(0, null);
    }

    public void displayData(double[] data) {
        for (double value : data) {
            System.out.println(value);
        }
    }
}
