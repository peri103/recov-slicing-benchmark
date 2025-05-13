import org.jfree.chart.renderer.xy.XYStepAreaRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Initialize series index and visibility
        int seriesIndex = 0;
        boolean visibility = true;
        
        /* write */ renderer.setSeriesShapesVisible(seriesIndex, visibility);
        
        /* read */ Boolean isVisible = renderer.getSeriesShapesVisible(seriesIndex);
        
        System.out.println("Series " + seriesIndex + " shapes visible: " + isVisible);
    }
}