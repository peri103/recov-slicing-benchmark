import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        /* write */ renderer.setShapesVisible(true);
        /* read */ Boolean isVisible = renderer.getShapesVisible();
        System.out.println(isVisible);
    }
}