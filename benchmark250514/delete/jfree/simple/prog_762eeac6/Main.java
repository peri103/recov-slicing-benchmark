import org.jfree.chart.renderer.xy.XYStepAreaRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        /* write */ renderer.setSeriesShapesVisible(0, true);
        /* read */ Boolean isVisible = renderer.getSeriesShapesVisible(0);
        System.out.println(isVisible);
    }
}