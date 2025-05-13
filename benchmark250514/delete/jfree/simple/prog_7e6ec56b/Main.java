import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        /* write */ renderer.setSeriesLinesVisible(0, true);
        
        /* read */ Boolean isVisible = renderer.getSeriesLinesVisible(0);
        
        System.out.println(isVisible);
    }
}