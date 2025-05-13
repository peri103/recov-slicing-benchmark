import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        
        // Initialize a list of colors
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.YELLOW);
        
        // Randomly select a color for the label shadow paint
        Random random = new Random();
        Color selectedColor = colors.get(random.nextInt(colors.size()));
        
        /* write */ plot.setLabelShadowPaint(selectedColor);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // More unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
        
        // Read the label shadow paint
        /* read */ Paint paint = plot.getLabelShadowPaint();
        
        System.out.println("Selected label shadow paint color: " + paint);
        
        // Further operations with the numbers list
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number in the list: " + max);
    }
}