import org.jfree.chart.renderer.xy.XYStepAreaRenderer;

public class XYStepAreaRendererWrapper {
    private XYStepAreaRenderer renderer = new XYStepAreaRenderer();

    public void setStepPoint(double stepPoint) {
        /* write */ renderer.setStepPoint(stepPoint);
    }

    public double getStepPoint() {
        return renderer.getStepPoint();
    }
}