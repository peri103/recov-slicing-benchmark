import java.util.ArrayList;
import java.awt.Paint;

public class RendererManager {
    private ArrayList<ChartRenderer> renderers;

    public RendererManager() {
        this.renderers = new ArrayList<>();
    }

    public void addRenderer(ChartRenderer renderer) {
        renderers.add(renderer);
    }

    public Paint getRendererPositivePaint(int index) {
        if (index < renderers.size()) {
            return renderers.get(index).getPositivePaint();
        }
        return null;
    }
}