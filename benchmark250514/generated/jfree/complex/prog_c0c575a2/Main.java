import org.jfree.chart.renderer.xy.XYBlockRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYBlockRenderer blockRenderer = new XYBlockRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        ArrayList<Double> blockWidths = new ArrayList<>();

        /* write */ blockRenderer.setBlockWidth(5.0);
        blockWidths.add(5.0);

        lineRenderer.setSeriesShapesVisible(0, true);
        lineRenderer.setSeriesLinesVisible(1, false);

        for (int i = 1; i <= 3; i++) {
            blockRenderer.setBlockWidth(i * 3.0);
            blockWidths.add(i * 3.0);
        }

        /* read */ double blockWidth = blockRenderer.getBlockWidth();
        System.out.println("Current block width: " + blockWidth);

        for (double width : blockWidths) {
            System.out.println("Stored block width: " + width);
        }

        double sumWidths = 0;
        for (double width : blockWidths) {
            sumWidths += width;
        }
        System.out.println("Sum of block widths: " + sumWidths);

        lineRenderer.setSeriesShapesVisible(2, false);
        lineRenderer.setSeriesLinesVisible(3, true);
    }
}