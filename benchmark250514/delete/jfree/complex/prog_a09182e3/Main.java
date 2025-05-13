import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            private Paint backgroundPaint;

            @Override
            public void setBackgroundPaint(Paint paint) {
                this.backgroundPaint = paint;
            }

            @Override
            public Paint getBackgroundPaint() {
                return this.backgroundPaint;
            }
        };

        ArrayList<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");

        HashMap<String, Color> colorMap = new HashMap<>();
        colorMap.put("RED", Color.RED);
        colorMap.put("GREEN", Color.GREEN);
        colorMap.put("BLUE", Color.BLUE);

        for (String colorName : colors) {
            Color color = colorMap.get(colorName);
            System.out.println("Setting plot background to: " + colorName);
            /* write */ plot.setBackgroundPaint(color);
        }

        // Simulate some complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Retrieve the background paint after complex operations
        /* read */ Paint backgroundPaint = plot.getBackgroundPaint();
        System.out.println("Current plot background paint: " + backgroundPaint);

        // Additional operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}