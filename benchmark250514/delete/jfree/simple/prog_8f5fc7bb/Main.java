import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.util.BooleanList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        BooleanList seriesLinesVisible = new BooleanList();
        seriesLinesVisible.setBoolean(0, true);
        
        /* write */ renderer.setSeriesLinesVisible(0, seriesLinesVisible.getBoolean(0));
        
        /* read */ Boolean isVisible = renderer.getSeriesLinesVisible(0);
        
        System.out.println(isVisible);
    }
}