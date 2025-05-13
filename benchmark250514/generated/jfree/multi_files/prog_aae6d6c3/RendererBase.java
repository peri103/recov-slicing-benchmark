import org.jfree.chart.renderer.xy.StackedXYBarRenderer;

public class RendererBase {
    private StackedXYBarRenderer renderer;

    public RendererBase() {
        renderer = new StackedXYBarRenderer();
    }

    public void setRendererBase(double baseValue) {
        /* write */ renderer.setBase(baseValue);
    }

    public StackedXYBarRenderer getRenderer() {
        return renderer;
    }
}
