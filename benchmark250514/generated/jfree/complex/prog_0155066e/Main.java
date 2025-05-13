import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer stepAreaRenderer = new XYStepAreaRenderer();
        Stroke stepStroke = new BasicStroke(2.0f);
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        Stroke lineStroke = new BasicStroke(1.0f);
        ArrayList<Color> colorList = new ArrayList<>();

        /* write */ stepAreaRenderer.setSeriesStroke(0, stepStroke);

        // Adding colors to the list
        colorList.add(Color.RED);
        colorList.add(Color.BLUE);
        colorList.add(Color.GREEN);

        // Set series paint for lineRenderer
        for (int i = 0; i < colorList.size(); i++) {
            lineRenderer.setSeriesPaint(i, colorList.get(i));
        }

        // Set series stroke for lineRenderer
        lineRenderer.setSeriesStroke(0, lineStroke);

        // Read series paint from lineRenderer
        Color readColor = (Color) lineRenderer.getSeriesPaint(0);
        System.out.println("Line Renderer Series Paint: " + readColor.toString());

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // Read series stroke from stepAreaRenderer
        /* read */ Stroke readStepStroke = stepAreaRenderer.getSeriesStroke(0);
        System.out.println("Step Area Renderer Series Stroke equals original: " + readStepStroke.equals(stepStroke));
    }
}