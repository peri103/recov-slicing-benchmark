import org.jfree.chart.renderer.xy.XYStepRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepRenderer renderer = new XYStepRenderer();
        /* write */ renderer.setBaseShapesVisible(true);
        /* read */ boolean isVisible = renderer.getBaseShapesVisible();
        System.out.println(isVisible);
    }
}