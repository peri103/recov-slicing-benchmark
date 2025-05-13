import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        
        // Unrelated code to create complexity
        ArrayList<Color> colorList = new ArrayList<>();
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);
        
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        for (int i = 0; i < colorList.size(); i++) {
            lineRenderer.setSeriesPaint(i, colorList.get(i));
        }
        
        // Setting up stroke for the first series
        /* write */ renderer.setSeriesStroke(0, stroke);

        // More unrelated code
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println("Color for series " + i + ": " + lineRenderer.getSeriesPaint(i));
        }
        
        // Retrieve the stroke set earlier
        /* read */ Stroke retrievedStroke = renderer.getSeriesStroke(0);
        System.out.println("Retrieved Stroke: " + retrievedStroke);

        // Further complexity with stroke manipulation
        BasicStroke newStroke = new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
        renderer.setSeriesStroke(1, newStroke);
        System.out.println("Stroke for series 1: " + renderer.getSeriesStroke(1));
        
        // Loop through and print strokes
        for (int i = 0; i < 2; i++) {
            System.out.println("Stroke for series " + i + ": " + renderer.getSeriesStroke(i));
        }
    }
}