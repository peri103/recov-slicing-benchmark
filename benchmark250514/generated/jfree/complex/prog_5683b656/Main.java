import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYAreaRenderer;

public class Main {
    public static void main(String[] args) {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        /* write */ renderer.setSeriesLinesVisible(0, true);
        
        XYItemRenderer itemRenderer = new XYLineAndShapeRenderer();
        itemRenderer.setSeriesPaint(0, java.awt.Color.RED);
        
        XYAreaRenderer areaRenderer = new XYAreaRenderer();
        areaRenderer.setSeriesPaint(1, java.awt.Color.BLUE);
        
        boolean isAreaVisible = areaRenderer.getSeriesPaint(1) != null;
        System.out.println("Area series 1 visible: " + isAreaVisible);
        
        boolean isItemVisible = itemRenderer.getSeriesPaint(0) != null;
        System.out.println("Item series 0 visible: " + isItemVisible);
        
        for (int i = 0; i < 5; i++) {
            itemRenderer.setSeriesPaint(i, new java.awt.Color(i * 50, i * 50, i * 50));
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Paint for series " + i + ": " + itemRenderer.getSeriesPaint(i));
        }
        
        /* read */ Boolean isVisible = renderer.getSeriesLinesVisible(0);
        System.out.println("Line series 0 visible: " + isVisible);
    }
}