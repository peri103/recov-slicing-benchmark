import org.jfree.chart.renderer.xy.XYStepRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepRenderer renderer = new XYStepRenderer();
        /* write */ renderer.setStepPoint(0.5);
        /* read */ double stepPoint = renderer.getStepPoint();
        System.out.println(stepPoint);
    }
}