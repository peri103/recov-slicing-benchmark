import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        
        BasicStroke stroke = new BasicStroke(2.0f);
        BasicStroke lineStroke = new BasicStroke(1.0f);
        
        /* write */ renderer.setSeriesOutlineStroke(0, stroke);
        
        // Additional unrelated operations
        lineRenderer.setSeriesPaint(0, Color.RED);
        lineRenderer.setSeriesStroke(0, lineStroke);
        
        // Complex operation using XYLineAndShapeRenderer
        for (int i = 0; i < 5; i++) {
            lineRenderer.setSeriesPaint(i, new Color(i * 50, i * 10, i * 30));
            lineRenderer.setSeriesStroke(i, new BasicStroke(i + 1.0f));
        }
        
        // Some more operations
        Color color = (Color) lineRenderer.getSeriesPaint(0);
        BasicStroke readLineStroke = (BasicStroke) lineRenderer.getSeriesStroke(0);
        System.out.println("Line color: " + color.toString());
        System.out.println("Line stroke width: " + readLineStroke.getLineWidth());
        
        /* read */ BasicStroke readStroke = (BasicStroke) renderer.getSeriesOutlineStroke(0);
        System.out.println("Stroke width: " + readStroke.getLineWidth());
        
        // Further operations
        for (int i = 0; i < 3; i++) {
            renderer.setSeriesOutlineStroke(i, new BasicStroke((i + 1) * 3.0f));
        }
        
        for (int i = 0; i < 3; i++) {
            BasicStroke tempStroke = (BasicStroke) renderer.getSeriesOutlineStroke(i);
            System.out.println("Series " + i + " stroke width: " + tempStroke.getLineWidth());
        }
    }
}