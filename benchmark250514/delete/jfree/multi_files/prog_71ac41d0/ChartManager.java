import org.jfree.chart.renderer.xy.XYItemRenderer;

public class ChartManager {
    private RendererConfig rendererConfig;

    public ChartManager() {
        this.rendererConfig = new RendererConfig();
    }

    public void setRendererVisibility(boolean visible) {
        rendererConfig.configureRenderer(visible);
    }

    public boolean checkRendererVisibility() {
        XYItemRenderer renderer = rendererConfig.getRenderer();
        /* read */ return renderer.getBaseShapesVisible();
    }
}
