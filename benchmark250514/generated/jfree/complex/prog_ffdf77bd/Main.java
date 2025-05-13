import org.jfree.chart.plot.MeterPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MeterPlot plot = new MeterPlot();
        Paint paint = Color.BLUE;
        Paint anotherPaint = Color.RED;

        // Some unrelated complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of squares: " + sum);

        // Another MeterPlot operation
        MeterPlot anotherPlot = new MeterPlot();
        anotherPlot.setDialBackgroundPaint(anotherPaint);
        Paint retrievedPaint = anotherPlot.getDialBackgroundPaint();
        System.out.println("Another plot paint: " + retrievedPaint);

        // Set the dial background paint
        /* write */ plot.setDialBackgroundPaint(paint);

        // More complex operations
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Java");

        StringBuilder sentence = new StringBuilder();
        for (String word : words) {
            sentence.append(word).append(" ");
        }
        System.out.println("Sentence: " + sentence.toString().trim());

        // Retrieve the dial background paint
        /* read */ Paint readPaint = plot.getDialBackgroundPaint();
        System.out.println("Original plot paint: " + readPaint);
    }
}