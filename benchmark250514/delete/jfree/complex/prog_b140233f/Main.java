import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.MeterNeedle;
import org.jfree.chart.needle.PointerNeedle;
import org.jfree.chart.needle.ArrowNeedle;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CompassPlot compassPlot = new CompassPlot();
        MeterNeedle needle = new MeterNeedle();
        
        // Additional CompassPlot and Needle usage
        CompassPlot compassPlot2 = new CompassPlot();
        PointerNeedle pointerNeedle = new PointerNeedle();
        ArrowNeedle arrowNeedle = new ArrowNeedle();
        
        compassPlot2.setSeriesNeedle(1, pointerNeedle);
        compassPlot2.setSeriesNeedle(2, arrowNeedle);
        
        MeterNeedle readNeedle2 = compassPlot2.getSeriesNeedle(1);
        MeterNeedle readNeedle3 = compassPlot2.getSeriesNeedle(2);
        
        System.out.println(readNeedle2 == pointerNeedle); // Should print true
        System.out.println(readNeedle3 == arrowNeedle);   // Should print true

        // Unrelated code to make the program more complex
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }
        
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        
        System.out.println("Sum of even numbers from 0 to 18: " + sum);
        
        /* write */ compassPlot.setSeriesNeedle(0, needle);
        
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        
        System.out.println("Product of numbers from 1 to 5: " + product);
        
        /* read */ MeterNeedle readNeedle = compassPlot.getSeriesNeedle(0);
        
        System.out.println(readNeedle == needle); // This should print true if the write and read operations are successful.
    }
}