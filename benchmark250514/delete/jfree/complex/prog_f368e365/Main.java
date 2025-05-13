import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYDotRenderer dotRenderer = new XYDotRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();

        // Setting properties for lineRenderer
        lineRenderer.setSeriesPaint(0, java.awt.Color.RED);
        lineRenderer.setSeriesShapesVisible(0, true);

        // Additional operations
        for (int i = 0; i < 3; i++) {
            lineRenderer.setSeriesStroke(i, new java.awt.BasicStroke(i + 1));
        }

        // Operations with dotRenderer
        dotRenderer.setDotWidth(10);
        dotRenderer.setDotHeight(10);

        // Complex logic
        int totalDotArea = 0;
        for (int i = 0; i < 5; i++) {
            totalDotArea += dotRenderer.getDotWidth() * dotRenderer.getDotHeight();
        }

        /* write */ dotRenderer.setDotHeight(5);  // Writing the dot height

        // More operations
        int seriesCount = lineRenderer.getSeriesCount();
        for (int i = 0; i < seriesCount; i++) {
            boolean visible = lineRenderer.getSeriesShapesVisible(i);
            System.out.println("Series " + i + " shapes visible: " + visible);
        }

        // Reading the dot height
        /* read */ int dotHeight = dotRenderer.getDotHeight();
        System.out.println(dotHeight);

        // Further operations
        totalDotArea += dotHeight * dotRenderer.getDotWidth();
        System.out.println("Total Dot Area: " + totalDotArea);
    }
}