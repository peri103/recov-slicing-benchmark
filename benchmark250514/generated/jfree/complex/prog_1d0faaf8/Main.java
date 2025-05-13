import org.jfree.chart.plot.MeterPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MeterPlot plot = new MeterPlot();
        Paint backgroundPaint = Color.BLUE;
        
        /* write */ plot.setDialBackgroundPaint(backgroundPaint);
        
        // Adding complexity with an unrelated ArrayList operation
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        // Continuing with more operations
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        
        for (String s : strings) {
            System.out.println(s);
        }
        
        // More MeterPlot operations
        Paint dialOutlinePaint = Color.RED;
        plot.setDialOutlinePaint(dialOutlinePaint);
        Paint readOutlinePaint = plot.getDialOutlinePaint();
        System.out.println("Dial Outline Paint: " + readOutlinePaint);
        
        /* read */ Paint readPaint = plot.getDialBackgroundPaint();
        System.out.println("Dial Background Paint: " + readPaint);
    }
}