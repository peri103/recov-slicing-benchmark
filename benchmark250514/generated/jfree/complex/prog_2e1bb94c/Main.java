import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.GradientPaint;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();

        // Setting up a GradientPaint for negative values
        GradientPaint negativePaint = new GradientPaint(0, 0, Color.BLUE, 100, 0, Color.CYAN);
        renderer.setNegativePaint(negativePaint);

        // Setting up a different paint for positive values
        /* write */ renderer.setPositivePaint(Color.RED);

        // Perform some unrelated operations
        XYDifferenceRenderer anotherRenderer = new XYDifferenceRenderer();
        anotherRenderer.setNegativePaint(Color.YELLOW);
        anotherRenderer.setPositivePaint(Color.GREEN);

        // Retrieve and print the negative paint
        GradientPaint retrievedNegativePaint = (GradientPaint) renderer.getNegativePaint();
        System.out.println("Negative Paint: " + retrievedNegativePaint);

        // Perform calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Retrieve and print the positive paint
        /* read */ Color color = (Color) renderer.getPositivePaint();
        System.out.println("Positive Paint: " + color);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}