import org.jfree.chart.renderer.Renderer;
import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.BasicStroke;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new BarRenderer();
        BasicStroke stroke = new BasicStroke(2.0f);
        /* write */ renderer.setBaseStroke(stroke);
        /* read */ BasicStroke retrievedStroke = (BasicStroke) renderer.getBaseStroke();
        System.out.println("Stroke width: " + retrievedStroke.getLineWidth());
    }
}