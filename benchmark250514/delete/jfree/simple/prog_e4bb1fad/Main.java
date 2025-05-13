import org.jfree.chart.renderer.Renderer;
import java.awt.BasicStroke;

public class Main {
    public static void main(String[] args) {
        // Assuming Renderer is instantiated properly, as it is an interface
        // For demonstration, we'll use a class that implements Renderer, such as AbstractRenderer
        Renderer renderer = new org.jfree.chart.renderer.AbstractRenderer();
        
        BasicStroke stroke = new BasicStroke(2.0f);
        
        /* write */ renderer.setBaseStroke(stroke);
        /* read */ BasicStroke readStroke = renderer.getBaseStroke();
        
        System.out.println(readStroke);
    }
}