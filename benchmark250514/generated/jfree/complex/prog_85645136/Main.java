import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null); // Assuming null data for simplicity

        // Create a HashMap to store series index and color
        HashMap<Integer, Color> seriesColors = new HashMap<>();
        seriesColors.put(0, Color.RED);
        seriesColors.put(1, Color.BLUE);
        seriesColors.put(2, Color.GREEN);

        // Set colors for multiple series using the HashMap
        for (Integer seriesIndex : seriesColors.keySet()) {
            plot.setSeriesPaint(seriesIndex, seriesColors.get(seriesIndex));
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // Set additional properties on the plot
        plot.setOutlinePaint(Color.BLACK);
        plot.setBackgroundPaint(Color.WHITE);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 integers: " + product);

        /* write */ plot.setSeriesPaint(0, Color.RED);

        // Retrieve and print series colors
        for (int i = 0; i < 3; i++) {
            Color color = (Color) plot.getSeriesPaint(i);
            System.out.println("Series " + i + " color: " + color);
        }

        // Perform some string manipulations
        String text = "Complex Program";
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed text: " + reversedText);

        /* read */ Color color = (Color) plot.getSeriesPaint(0);
        System.out.println("Read series 0 color: " + color);

        // Additional calculations
        double average = sum / 10.0;
        System.out.println("Average of squares: " + average);
    }
}