import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        // Set the visibility of lines for a specific series
        int seriesIndex = 0; // Assuming we are working with the first series
        boolean isVisible = true;
        /* write */ renderer.setSeriesLinesVisible(seriesIndex, isVisible);
        
        // Retrieve the visibility of lines for the specific series
        /* read */ Boolean visibility = renderer.getSeriesLinesVisible(seriesIndex);
        
        System.out.println("Series " + seriesIndex + " lines visible: " + visibility);
    }
}