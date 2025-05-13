import org.jfree.chart.renderer.Renderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Renderer renderer = new Renderer() {
            private Paint[] seriesPaints = new Paint[3];

            @Override
            public void setSeriesPaint(int series, Paint paint) {
                seriesPaints[series] = paint;
            }

            @Override
            public Paint getSeriesPaint(int series) {
                return seriesPaints[series];
            }
        };

        Map<Integer, String> seriesDescriptions = new HashMap<>();
        seriesDescriptions.put(0, "Series A");
        seriesDescriptions.put(1, "Series B");
        seriesDescriptions.put(2, "Series C");

        // Configure paints for different series
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesPaint(2, Color.GREEN);

        // Complex logic involving series descriptions and paint settings
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                /* write */ renderer.setSeriesPaint(i, Color.RED);
            }
            String description = seriesDescriptions.get(i);
            Paint paint = renderer.getSeriesPaint(i);
            System.out.println("Series " + description + " has paint: " + paint);
        }

        // Additional logic with unrelated computations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Access the paint for the first series
        /* read */ Paint firstSeriesPaint = renderer.getSeriesPaint(0);
        System.out.println("First series paint: " + firstSeriesPaint);

        // More unrelated complex logic
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}