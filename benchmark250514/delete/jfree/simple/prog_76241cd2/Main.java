import org.jfree.chart.renderer.Renderer;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
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
        };

        Stroke stroke = new BasicStroke(2.0f);
        /* write */ renderer.setBaseStroke(stroke);
        /* read */ Stroke readStroke = renderer.getBaseStroke();
        System.out.println(readStroke);
    }
}