import org.jfree.chart.renderer.Renderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.BasicStroke;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new XYLineAndShapeRenderer();
        BasicStroke stroke = new BasicStroke(2.0f);
        
        /* write */ renderer.setBaseStroke(stroke);
        /* read */ BasicStroke readStroke = (BasicStroke) renderer.getBaseStroke();
        
        System.out.println("Stroke width: " + readStroke.getLineWidth());
    }
}