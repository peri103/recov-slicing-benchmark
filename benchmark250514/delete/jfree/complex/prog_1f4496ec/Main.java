import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;

public class Main {
    public static void main(String[] args) {
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        XYBarRenderer barRenderer = new XYBarRenderer();
        XYItemRenderer itemRenderer = new XYItemRenderer() {};

        /* write */ lineRenderer.setShapesVisible(true);

        barRenderer.setSeriesVisible(0, true);
        itemRenderer.setSeriesVisible(1, false);

        boolean barVisible = barRenderer.getSeriesVisible(0);
        boolean itemVisible = itemRenderer.isSeriesVisible(1);
        System.out.println("Bar Series Visible: " + barVisible);
        System.out.println("Item Series Visible: " + itemVisible);

        int numRenderers = 3;
        for (int i = 0; i < numRenderers; i++) {
            System.out.println("Renderer " + i + " initialized.");
        }

        /* read */ boolean isShapesVisible = lineRenderer.getShapesVisible();
        System.out.println("Line Shapes Visible: " + isShapesVisible);

        for (int i = 0; i < numRenderers; i++) {
            if (i % 2 == 0) {
                System.out.println("Renderer " + i + " is active.");
            } else {
                System.out.println("Renderer " + i + " is inactive.");
            }
        }
    }
}