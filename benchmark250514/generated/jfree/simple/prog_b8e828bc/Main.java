import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        // Write operation: set the visibility of the series lines
        /* write */ renderer.setSeriesLinesVisible(0, true);
        
        // Read operation: get the visibility of the series lines
        /* read */ Boolean isVisible = renderer.getSeriesLinesVisible(0);
        
        System.out.println("Series line visibility: " + isVisible);
    }
}