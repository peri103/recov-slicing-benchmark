import org.jfree.chart.renderer.xy.XYStepRenderer;

public class RendererSettings {
    private XYStepRenderer stepRenderer = new XYStepRenderer();

    public void setStepRendererShapesVisible(boolean visible) {
        /* write */ stepRenderer.setBaseShapesVisible(visible);
    }

    public boolean isStepRendererShapesVisible() {
        return stepRenderer.getBaseShapesVisible();
    }
}
