import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        BasicStroke stroke = new BasicStroke(2.0f);

        /* write */ renderer.setSeriesOutlineStroke(0, stroke);
        /* read */ BasicStroke readStroke = (BasicStroke) renderer.getSeriesOutlineStroke(0);

        System.out.println("Stroke width: " + readStroke.getLineWidth());
    }
}