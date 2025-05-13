import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        /* write */ renderer.setSeriesLinesVisible(0, true);
        /* read */ Boolean isVisible = renderer.getSeriesLinesVisible(0);
        System.out.println(isVisible);
    }
}