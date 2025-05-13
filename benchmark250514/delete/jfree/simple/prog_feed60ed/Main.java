import org.jfree.chart.renderer.xy.XYStepAreaRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        /* write */ renderer.setSeriesLinesVisible(0, true);
        /* read */ Boolean isVisible = renderer.getSeriesLinesVisible(0);
        System.out.println(isVisible);
    }
}