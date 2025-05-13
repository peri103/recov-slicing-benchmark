import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.Needle;
import org.jfree.chart.needle.ArrowNeedle;
import org.jfree.chart.needle.PinNeedle;

public class Main {
    public static void main(String[] args) {
        CompassPlot plot = new CompassPlot();
        Needle needle = new ArrowNeedle();
        
        /* write */ plot.setSeriesNeedle(0, needle);

        // Adding complexity: using another needle type
        Needle pinNeedle = new PinNeedle();
        plot.setSeriesNeedle(1, pinNeedle);

        // Performing some operations
        CompassPlot anotherPlot = new CompassPlot();
        Needle anotherNeedle = new ArrowNeedle();
        anotherPlot.setSeriesNeedle(0, anotherNeedle);
        Needle retrievedNeedle = anotherPlot.getSeriesNeedle(0);
        System.out.println("Another plot needle equals: " + retrievedNeedle.equals(anotherNeedle));

        // More operations
        for (int i = 0; i < 5; i++) {
            plot.setSeriesNeedle(i, new PinNeedle());
        }
        
        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Reading the original needle
        /* read */ Needle readNeedle = plot.getSeriesNeedle(0);
        
        System.out.println("Original plot needle equals: " + readNeedle.equals(needle));
    }
}