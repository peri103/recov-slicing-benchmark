import org.jfree.chart.renderer.xy.XYStepAreaRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        /* write */ renderer.setStepPoint(0.5);
        /* read */ double stepPoint = renderer.getStepPoint();
        System.out.println(stepPoint);
    }
}