import org.jfree.chart.renderer.Renderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import java.awt.BasicStroke;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new XYLineAndShapeRenderer();
        BasicStroke stroke = new BasicStroke(2.0f);
        Color color = Color.RED;

        /* write */ renderer.setBaseStroke(stroke);

        // Additional complex operations
        XYItemRenderer itemRenderer = new XYBarRenderer();
        itemRenderer.setSeriesPaint(0, color);

        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        lineRenderer.setSeriesShapesVisible(0, true);
        lineRenderer.setSeriesLinesVisible(0, true);

        // Perform some operations using the itemRenderer
        itemRenderer.setSeriesOutlinePaint(0, Color.BLUE);
        itemRenderer.setSeriesPaint(1, Color.GREEN);

        lineRenderer.setSeriesPaint(0, Color.YELLOW);
        lineRenderer.setSeriesStroke(0, new BasicStroke(1.0f));

        // More operations
        lineRenderer.setSeriesPaint(1, Color.ORANGE);
        lineRenderer.setSeriesStroke(1, new BasicStroke(3.0f));

        // Retrieve and print the stroke
        /* read */ BasicStroke readStroke = (BasicStroke) renderer.getBaseStroke();
        System.out.println("Stroke width: " + readStroke.getLineWidth());

        // Additional operations
        itemRenderer.setSeriesOutlineStroke(1, new BasicStroke(4.0f));
        itemRenderer.setSeriesOutlinePaint(1, Color.MAGENTA);
    }
}