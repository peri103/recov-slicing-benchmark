import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new XYLineAndShapeRenderer();
        
        // Define a paint color
        Paint paint = Color.RED;
        
        /* write */ renderer.setSeriesPaint(0, paint);
        
        // Add complexity: create a list of colors and set them to different series
        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(Color.BLUE);
        paintList.add(Color.GREEN);
        paintList.add(Color.YELLOW);
        paintList.add(Color.ORANGE);

        for (int i = 1; i <= paintList.size(); i++) {
            renderer.setSeriesPaint(i, paintList.get(i - 1));
        }

        // Perform some unrelated operations
        Random rand = new Random();
        int randomIndex = rand.nextInt(paintList.size());

        Paint randomPaint = paintList.get(randomIndex);
        System.out.println("Randomly chosen paint: " + randomPaint);

        // More unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(0);

        System.out.println("Retrieved paint for series 0: " + retrievedPaint);
        
        // Additional operations: check the paint for all series
        for (int i = 0; i <= paintList.size(); i++) {
            Paint seriesPaint = renderer.getSeriesPaint(i);
            System.out.println("Paint for series " + i + ": " + seriesPaint);
        }
    }
}