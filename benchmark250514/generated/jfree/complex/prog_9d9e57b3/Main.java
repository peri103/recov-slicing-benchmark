import org.jfree.chart.renderer.xy.XYAreaRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer areaRenderer = new XYAreaRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        
        Paint fillPaint = new Color(255, 0, 0); // Red color
        Paint linePaint = new Color(0, 255, 0); // Green color
        
        /* write */ areaRenderer.setSeriesFillPaint(0, fillPaint);
        
        ArrayList<Paint> paints = new ArrayList<>();
        paints.add(fillPaint);
        paints.add(linePaint);
        
        lineRenderer.setSeriesPaint(0, linePaint);
        Paint retrievedLinePaint = lineRenderer.getSeriesPaint(0);
        
        for (Paint paint : paints) {
            System.out.println("Paint in list: " + paint);
        }
        
        Paint retrievedPaint = areaRenderer.getSeriesFillPaint(0);
        /* read */ System.out.println("Retrieved fill paint: " + retrievedPaint);
        
        for (int i = 0; i < paints.size(); i++) {
            System.out.println("Paint at index " + i + ": " + paints.get(i));
        }
        
        System.out.println("Retrieved line paint: " + retrievedLinePaint);
    }
}