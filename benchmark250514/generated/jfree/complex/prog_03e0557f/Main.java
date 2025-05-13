import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        Stroke lineStroke = new BasicStroke(1.0f);
        
        // Initialize an ArrayList to store strokes
        ArrayList<Stroke> strokeList = new ArrayList<>();
        strokeList.add(stroke);
        strokeList.add(lineStroke);

        // Set stroke for series in renderer
        /* write */ renderer.setSeriesStroke(0, stroke);
        lineRenderer.setSeriesStroke(1, lineStroke);
        
        // Perform some operations with the line renderer
        Stroke retrievedLineStroke = lineRenderer.getSeriesStroke(1);
        System.out.println("Line stroke equals: " + retrievedLineStroke.equals(lineStroke));

        // Perform operations with the stroke list
        for (int i = 0; i < strokeList.size(); i++) {
            System.out.println("Stroke at index " + i + ": " + strokeList.get(i));
        }

        // Retrieve the stroke from the renderer
        /* read */ Stroke retrievedStroke = renderer.getSeriesStroke(0);
        
        // Check if the retrieved stroke is the same as the original stroke
        System.out.println("Step Area stroke equals: " + retrievedStroke.equals(stroke));
    }
}