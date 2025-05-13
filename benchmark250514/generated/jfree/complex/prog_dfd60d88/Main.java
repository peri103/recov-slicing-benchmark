import org.jfree.chart.plot.FastScatterPlot;
import java.awt.Paint;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FastScatterPlot plot = new FastScatterPlot();
        Paint paint = Color.RED;
        /* write */ plot.setDomainGridlinePaint(paint);

        // Unrelated code to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        // Another API pair usage with FastScatterPlot
        Paint backgroundPaint = Color.BLUE;
        plot.setBackgroundPaint(backgroundPaint);
        Paint retrievedBackgroundPaint = plot.getBackgroundPaint();
        System.out.println("Background Paint: " + retrievedBackgroundPaint);

        /* read */ Paint retrievedPaint = plot.getDomainGridlinePaint();
        System.out.println("Domain Gridline Paint: " + retrievedPaint);

        // Further complexity with additional logic
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        for (String color : colors) {
            System.out.println("Color: " + color);
        }
    }
}