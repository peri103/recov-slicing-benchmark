import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        
        /* write */ stepAreaRenderer.setSeriesOutlineStroke(0, stroke);
        
        // Additional complex code
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        lineRenderer.setSeriesPaint(0, Color.RED);
        lineRenderer.setSeriesStroke(0, new BasicStroke(1.0f));
        
        Stroke anotherStroke = new BasicStroke(3.0f);
        stepAreaRenderer.setSeriesOutlineStroke(1, anotherStroke);
        
        Color seriesColor = (Color) lineRenderer.getSeriesPaint(0);
        System.out.println("Series color: " + seriesColor);

        Stroke readStroke = stepAreaRenderer.getSeriesOutlineStroke(1);
        System.out.println("Another stroke: " + readStroke);

        Stroke readStrokeOriginal = stepAreaRenderer.getSeriesOutlineStroke(0);
        /* read */ System.out.println(readStrokeOriginal.equals(stroke));
    }
}