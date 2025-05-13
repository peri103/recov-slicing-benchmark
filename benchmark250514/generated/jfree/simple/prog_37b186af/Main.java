import org.jfree.chart.renderer.category.LineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        
        // Write operation
        /* write */ renderer.setSeriesShapesVisible(0, true);
        
        // Read operation
        /* read */ Boolean isVisible = renderer.getSeriesShapesVisible(0);
        
        System.out.println(isVisible);
    }
}