import org.jfree.chart.renderer.xy.XYStepAreaRenderer;

public class StepPointManager {
    private XYStepAreaRenderer renderer = new XYStepAreaRenderer();

    public void setStepPoint(double point) {
        /* write */ renderer.setStepPoint(point);
    }

    public double getStepPoint() {
        return renderer.getStepPoint();
    }
}
