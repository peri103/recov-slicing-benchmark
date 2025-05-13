import org.jfree.chart.renderer.xy.XYStepAreaRenderer;

public class ChartRenderer {
    private XYStepAreaRenderer renderer;

    public ChartRenderer() {
        this.renderer = new XYStepAreaRenderer();
    }

    public void setRendererStepPoint(double stepPoint) {
        /* write */ renderer.setStepPoint(stepPoint);
    }

    public double getRendererStepPoint() {
        return renderer.getStepPoint();
    }
}
