import org.jfree.chart.renderer.xy.XYDotRenderer;

public class ChartRenderer {
    private XYDotRenderer dotRenderer = new XYDotRenderer();

    public void configureDotRenderer(int dotHeight) {
        /* write */ dotRenderer.setDotHeight(dotHeight);
    }

    public int getDotHeight() {
        return dotRenderer.getDotHeight();
    }
}