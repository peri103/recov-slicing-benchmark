import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarRenderer renderer = new BarRenderer();
        Paint paint = new Color(255, 0, 0); // Red color

        /* write */ renderer.setSeriesOutlinePaint(0, paint);

        // Additional complexity: using another BarRenderer with different colors
        BarRenderer renderer2 = new BarRenderer();
        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(new Color(0, 255, 0)); // Green color
        paintList.add(new Color(0, 0, 255)); // Blue color

        for (int i = 0; i < paintList.size(); i++) {
            renderer2.setSeriesOutlinePaint(i, paintList.get(i));
        }

        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More operations on renderer2
        for (int i = 0; i < paintList.size(); i++) {
            Paint retrievedPaint2 = renderer2.getSeriesOutlinePaint(i);
            System.out.println("Renderer2 series " + i + " outline paint: " + retrievedPaint2);
        }

        // Unrelated list operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        /* read */ Paint retrievedPaint = renderer.getSeriesOutlinePaint(0);
        System.out.println("Renderer series 0 outline paint: " + retrievedPaint);
    }
}