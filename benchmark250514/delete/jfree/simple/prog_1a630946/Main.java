import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.jfree.chart.renderer.xy.XYStepRenderer$StepPoint;

public class Main {
    public static void main(String[] args) {
        XYStepRenderer renderer = new XYStepRenderer();
        XYStepRenderer$StepPoint stepPoint = XYStepRenderer$StepPoint.MIDDLE;
        
        /* write */ renderer.setStepPoint(stepPoint);
        /* read */ XYStepRenderer$StepPoint retrievedStepPoint = renderer.getStepPoint();
        
        System.out.println(retrievedStepPoint);
    }
}