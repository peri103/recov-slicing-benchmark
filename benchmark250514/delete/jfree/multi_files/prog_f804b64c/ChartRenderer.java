import org.jfree.chart.renderer.xy.XYStepAreaRenderer;

public class ChartRenderer {
    private XYStepAreaRenderer stepAreaRenderer;

    public ChartRenderer() {
        this.stepAreaRenderer = new XYStepAreaRenderer();
    }

    public void setSeriesShapesVisible(int series, boolean visible) {
        /* write */ stepAreaRenderer.setSeriesShapesVisible(series, visible);
    }

    public XYStepAreaRenderer getStepAreaRenderer() {
        return stepAreaRenderer;
    }
}
