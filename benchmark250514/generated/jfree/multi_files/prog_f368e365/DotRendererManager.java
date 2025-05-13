import org.jfree.chart.renderer.xy.XYDotRenderer;

public class DotRendererManager {
    private XYDotRenderer dotRenderer;

    public DotRendererManager() {
        this.dotRenderer = new XYDotRenderer();
    }

    public void setDotHeight(int height) {
        /* write */ dotRenderer.setDotHeight(height);
    }

    public int getDotHeight() {
        return dotRenderer.getDotHeight();
    }
}
