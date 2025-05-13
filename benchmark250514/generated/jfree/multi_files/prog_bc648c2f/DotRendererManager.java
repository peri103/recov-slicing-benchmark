import org.jfree.chart.renderer.xy.XYDotRenderer;

public class DotRendererManager {
    private XYDotRenderer renderer;

    public DotRendererManager() {
        renderer = new XYDotRenderer();
    }

    public void setDotWidth(int width) {
        /* write */ renderer.setDotWidth(width);
    }

    public int getDotWidth() {
        return renderer.getDotWidth();
    }
}
