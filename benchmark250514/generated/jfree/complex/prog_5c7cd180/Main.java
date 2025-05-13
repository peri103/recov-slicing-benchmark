import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Stroke stroke = new BasicStroke(2.0f);

        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        Stroke lineStroke = new BasicStroke(1.0f);
        lineRenderer.setSeriesStroke(0, lineStroke);

        ArrayList<Stroke> strokeList = new ArrayList<>();
        strokeList.add(lineStroke);

        /* write */ renderer.setSeriesStroke(0, stroke);

        for (int i = 0; i < strokeList.size(); i++) {
            Stroke s = strokeList.get(i);
            System.out.println("Stroke from list: " + s);
        }

        Stroke retrievedLineStroke = lineRenderer.getSeriesStroke(0);
        System.out.println("Retrieved line stroke: " + retrievedLineStroke);

        Stroke defaultStroke = new BasicStroke(0.5f);
        renderer.setSeriesStroke(1, defaultStroke);

        Stroke retrievedDefaultStroke = renderer.getSeriesStroke(1);
        System.out.println("Retrieved default stroke: " + retrievedDefaultStroke);

        /* read */ Stroke retrievedStroke = renderer.getSeriesStroke(0);

        System.out.println("Retrieved stroke equals original: " + retrievedStroke.equals(stroke)); // Should print true

        ArrayList<XYStepAreaRenderer> rendererList = new ArrayList<>();
        rendererList.add(renderer);

        for (XYStepAreaRenderer r : rendererList) {
            System.out.println("Renderer in list: " + r);
        }
    }
}