import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        XYItemRenderer renderer = new XYItemRenderer() {
            // Implement required methods if any
        };
        
        /* write */ plot.setRenderer(renderer);
        /* read */ XYItemRenderer retrievedRenderer = plot.getRenderer();
        
        System.out.println(retrievedRenderer == renderer); // should print true
    }
}