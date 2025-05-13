import org.jfree.chart.renderer.Renderer;
import java.awt.BasicStroke;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new Renderer() {
            private BasicStroke baseStroke;

            @Override
            public void setBaseStroke(BasicStroke stroke) {
                this.baseStroke = stroke;
            }

            @Override
            public BasicStroke getBaseStroke() {
                return this.baseStroke;
            }
        };

        BasicStroke stroke = new BasicStroke(2.0f);
        /* write */ renderer.setBaseStroke(stroke);
        /* read */ BasicStroke readStroke = renderer.getBaseStroke();
        System.out.println("Stroke width: " + readStroke.getLineWidth());
    }
}