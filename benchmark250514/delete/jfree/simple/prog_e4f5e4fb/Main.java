import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.util.BooleanList;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        BooleanList visibilityList = new BooleanList();
        
        // Setting the visibility for the series lines
        boolean isVisible = true;
        int seriesIndex = 0; // Assuming series index 0 for demonstration
        visibilityList.setBoolean(seriesIndex, isVisible);
        
        /* write */ renderer.setSeriesLinesVisible(seriesIndex, isVisible);
        
        // Retrieving the visibility for the series lines
        /* read */ Boolean retrievedVisibility = renderer.getSeriesLinesVisible(seriesIndex);
        
        System.out.println("Series " + seriesIndex + " lines visibility: " + retrievedVisibility);
    }
}