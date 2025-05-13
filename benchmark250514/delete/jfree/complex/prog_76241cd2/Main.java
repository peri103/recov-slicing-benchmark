import org.jfree.chart.renderer.Renderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new Renderer() {
            private Stroke baseStroke;
            private Stroke secondaryStroke;

            @Override
            public void setBaseStroke(Stroke stroke) {
                this.baseStroke = stroke;
            }

            @Override
            public Stroke getBaseStroke() {
                return this.baseStroke;
            }

            public void setSecondaryStroke(Stroke stroke) {
                this.secondaryStroke = stroke;
            }

            public Stroke getSecondaryStroke() {
                return this.secondaryStroke;
            }
        };

        Stroke stroke = new BasicStroke(2.0f);
        Stroke secondaryStroke = new BasicStroke(1.0f);

        /* write */ renderer.setBaseStroke(stroke);

        ArrayList<Stroke> strokeList = new ArrayList<>();
        strokeList.add(stroke);
        strokeList.add(secondaryStroke);

        renderer.setSecondaryStroke(strokeList.get(1));

        for (Stroke s : strokeList) {
            System.out.println("Stroke in list: " + s);
        }

        Stroke readSecondaryStroke = renderer.getSecondaryStroke();
        System.out.println("Secondary Stroke: " + readSecondaryStroke);

        /* read */ Stroke readStroke = renderer.getBaseStroke();
        System.out.println("Base Stroke: " + readStroke);

        ArrayList<String> strokeDescriptions = new ArrayList<>();
        strokeDescriptions.add("Base Stroke: " + readStroke);
        strokeDescriptions.add("Secondary Stroke: " + readSecondaryStroke);

        for (String description : strokeDescriptions) {
            System.out.println(description);
        }
    }
}