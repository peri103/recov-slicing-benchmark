import org.jfree.chart.renderer.Renderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Assuming Renderer is a concrete class, otherwise we would need a specific implementation.
        Renderer renderer = new Renderer() {
            private Paint[] paints = new Paint[10];

            @Override
            public void setSeriesPaint(int series, Paint paint) {
                paints[series] = paint;
            }

            @Override
            public Paint getSeriesPaint(int series) {
                return paints[series];
            }
        };

        Map<Integer, Paint> paintMap = new HashMap<>();
        paintMap.put(1, Color.BLUE);
        paintMap.put(2, Color.GREEN);

        for (Map.Entry<Integer, Paint> entry : paintMap.entrySet()) {
            renderer.setSeriesPaint(entry.getKey(), entry.getValue());
        }

        // Some unrelated computations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        /* write */ renderer.setSeriesPaint(0, Color.RED);

        // More unrelated code
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product: " + product);

        // Using the map to retrieve and print paints
        for (int i = 1; i <= 2; i++) {
            Paint paint = renderer.getSeriesPaint(i);
            System.out.println("Paint for series " + i + ": " + paint);
        }

        /* read */ Paint paint = renderer.getSeriesPaint(0);
        System.out.println(paint);

        // Additional logic to demonstrate complexity
        Map<Integer, String> seriesNames = new HashMap<>();
        seriesNames.put(0, "Red Series");
        seriesNames.put(1, "Blue Series");
        seriesNames.put(2, "Green Series");

        for (Map.Entry<Integer, String> entry : seriesNames.entrySet()) {
            System.out.println("Series " + entry.getKey() + ": " + entry.getValue());
        }
    }
}