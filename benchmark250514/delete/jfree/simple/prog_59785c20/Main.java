import org.jfree.chart.renderer.Renderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Initialize a Renderer object
        Renderer renderer = new Renderer() {
            private Stroke baseStroke;

            @Override
            public void setBaseStroke(Stroke stroke) {
                this.baseStroke = stroke;
            }

            @Override
            public Stroke getBaseStroke() {
                return this.baseStroke;
            }

            // Other methods from the Renderer interface would be implemented here
        };

        // Create a BasicStroke object to be used for setting the base stroke
        BasicStroke stroke = new BasicStroke(2.0f);

        /* write */ renderer.setBaseStroke(stroke);
        /* read */ Stroke readStroke = renderer.getBaseStroke();

        System.out.println("Base Stroke: " + readStroke);
    }
}