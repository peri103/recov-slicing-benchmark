import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new XYLineAndShapeRenderer();
        Paint paint = Color.RED;
        Paint defaultPaint = Color.BLUE;
        HashMap<Integer, Paint> paintMap = new HashMap<>();
        
        /* write */ renderer.setSeriesPaint(0, paint);
        
        // Adding multiple series paints to a map
        paintMap.put(0, paint);
        paintMap.put(1, Color.GREEN);
        paintMap.put(2, Color.YELLOW);

        // Using another renderer for different purposes
        XYBarRenderer barRenderer = new XYBarRenderer();
        barRenderer.setSeriesPaint(0, Color.CYAN);
        barRenderer.setSeriesPaint(1, Color.MAGENTA);

        // Some unrelated operations
        int[] seriesIndices = {0, 1, 2};
        for (int index : seriesIndices) {
            Paint seriesPaint = paintMap.getOrDefault(index, defaultPaint);
            System.out.println("Series " + index + " Paint: " + seriesPaint);
        }

        // More operations on renderer
        renderer.setSeriesPaint(1, Color.ORANGE);
        renderer.setSeriesPaint(2, Color.PINK);

        // Retrieving the paint set earlier
        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(0);
        
        // Output the retrieved paint
        System.out.println("Retrieved Paint: " + retrievedPaint);
        
        // Further operations with barRenderer
        for (int i = 0; i < 2; i++) {
            Paint barPaint = barRenderer.getSeriesPaint(i);
            System.out.println("Bar Series " + i + " Paint: " + barPaint);
        }
    }
}