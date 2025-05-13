import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.GradientPaint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        
        // Additional complex operations
        ArrayList<Color> colorList = new ArrayList<>();
        colorList.add(Color.RED);
        colorList.add(Color.BLUE);
        colorList.add(Color.YELLOW);
        
        for (Color color : colorList) {
            renderer.setPositivePaint(color);
            GradientPaint gradientPaint = new GradientPaint(0, 0, color, 100, 100, Color.WHITE);
            renderer.setNegativePaint(gradientPaint);
        }
        
        /* write */ renderer.setPositivePaint(Color.GREEN);
        
        // More complex operations
        Color defaultColor = Color.BLACK;
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                renderer.setPositivePaint(colorList.get(i));
            } else {
                renderer.setNegativePaint(new GradientPaint(0, 0, colorList.get(i), 100, 100, defaultColor));
            }
        }
        
        /* read */ Color positivePaint = (Color) renderer.getPositivePaint();
        System.out.println("Positive Paint: " + positivePaint);
        
        // Unrelated complex operations
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numberList.add(i * 10);
        }
        for (int number : numberList) {
            System.out.println("Number: " + number);
        }
    }
}