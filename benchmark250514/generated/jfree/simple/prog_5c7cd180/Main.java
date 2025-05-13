import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Stroke stroke = new BasicStroke(2.0f);

        /* write */ renderer.setSeriesStroke(0, stroke);
        /* read */ Stroke retrievedStroke = renderer.getSeriesStroke(0);

        System.out.println(retrievedStroke.equals(stroke)); // Should print true
    }
}