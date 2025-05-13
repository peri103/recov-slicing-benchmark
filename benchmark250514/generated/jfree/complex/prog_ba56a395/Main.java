import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        Stroke lineStroke = new BasicStroke(1.0f);
        
        /* write */ stepAreaRenderer.setSeriesStroke(0, stroke);
        
        lineRenderer.setSeriesPaint(0, Color.BLUE);
        lineRenderer.setSeriesStroke(0, lineStroke);

        XYPlot plot = new XYPlot();
        plot.setRenderer(0, stepAreaRenderer);
        plot.setRenderer(1, lineRenderer);
        
        for (int i = 0; i < 5; i++) {
            Stroke tempStroke = new BasicStroke(i + 0.5f);
            stepAreaRenderer.setSeriesStroke(i, tempStroke);
        }
        
        /* read */ Stroke retrievedStroke = stepAreaRenderer.getSeriesStroke(0);
        
        System.out.println("Retrieved Stroke: " + retrievedStroke);
        
        for (int i = 0; i < 5; i++) {
            Stroke tempStroke = lineRenderer.getSeriesStroke(i);
            if (tempStroke != null) {
                System.out.println("Line Renderer Stroke for series " + i + ": " + tempStroke);
            }
        }
        
        Color color = (Color) lineRenderer.getSeriesPaint(0);
        System.out.println("Line Renderer Paint for series 0: " + color);
    }
}