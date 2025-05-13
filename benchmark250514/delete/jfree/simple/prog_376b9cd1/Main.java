import org.jfree.chart.renderer.Renderer;
import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new BarRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        
        /* write */ renderer.setBaseStroke(stroke);
        /* read */ Stroke retrievedStroke = renderer.getBaseStroke();
        
        System.out.println(retrievedStroke);
    }
}