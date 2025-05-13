import org.jfree.chart.renderer.xy.XYStepAreaRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Initialize the series index and visibility flag
        int seriesIndex = 0;
        boolean isVisible = true;
        
        /* write */ renderer.setSeriesShapesVisible(seriesIndex, isVisible);
        /* read */ Boolean visibility = renderer.getSeriesShapesVisible(seriesIndex);
        
        System.out.println("Series " + seriesIndex + " shapes visible: " + visibility);
    }
}